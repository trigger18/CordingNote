---  JSP  ---

<!-- 페이지 번호 -->
   <div class="pagelist">
            <!-- 이전 출력 시작 -->
            <c:if test="${pv.startPage > 1 }">
               <ul class="pagination">
                  <li><a class="pagecolor"
                     href="essay_list.do?currentPage=${pv.startPage-pv.blockPage }">이전</a></li>
               </ul>
            </c:if>
            <!-- 이전 출력 끝 -->
            <!-- 페이지 출력 시작 -->
            <c:forEach var="i" begin="${pv.startPage }" end="${pv.endPage }">

               <span> <c:url var="currPage" value="essay_list.do">
                     <c:param name="currentPage" value="${i }" />
                  </c:url> <c:choose>
                     <c:when test="${i == pv.currentPage }">
                        <ul class="pagination">
                           <li><a href="${currPage }" class="pagecolor"> <c:out
                                    value="${i }" />
                           </a></li>
                        </ul>
                     </c:when>
                     <c:otherwise>
                     <ul class="pagination">
                        <li><a href="${currPage }" class="pagecolor"> <c:out value="${i }" />
                        </a></li>
                        </ul>
                     </c:otherwise>
                  </c:choose>
               </span>
            </c:forEach>
            <!-- 페이지 출력 끝 -->
            <!-- 다음 출력 시작 -->
            <c:if test="${pv.totalPage > pv.endPage }">
               <ul class="pagination">
                  <li><a class="pagecolor"
                     href="essay_list.do?currentPage=${pv.startPage+pv.blockPage }">다음</a></li>
               </ul>
            </c:if>
            <!-- 다음 출력 끝 -->
         </div>
         <!-- /페이지 번호 -->

         <div class="clearfix visible-md visible-lg"></div>
         <c:choose>
            <c:when test="${CheckMentor==1}">
               <button id="w_btn" onclick="location.href='essay_write.do'"
                  class="primary-button center-block">글쓰기</button>
            </c:when>
         </c:choose>
<!-- /페이지 번호 -->

---  Java  ---

public class PageDTO {
	private int currentPage; // 현재페이지
	private int totalCount; // 총 레코드수
	private int blockCount = 6; // 한 페이지에 보여줄 레코드수
	private int blockPage = 3; // 한 블록에 보여줄 페이지수
	private int totalPage; // 총 페이지수
	private int startRow; // 시작 레코드 번호
	private int endRow; // 끝 레코드번호
	private int startPage; // 한 블록의 시작 페이지 번호
	private int endPage; // 한 블록의 끝페이지 번호
	private int number;	

	private String searchKey;
	private String searchWord;

	public PageDTO() {

	}


	public PageDTO(int currentPage, int totalCount) {
		this.currentPage = currentPage;
		this.totalCount = totalCount;

		// 시작레코드
		startRow = (currentPage - 1) * blockCount + 1;

		// 끝레코드
		endRow = startRow + blockCount - 1;

		// 총페이지수
		totalPage = totalCount / blockCount + (totalCount % blockCount == 0 ? 0 : 1);

		// 시작페이지
		startPage = (int) ((currentPage - 1) / blockPage) * blockPage + 1;

		// 끝페이지
		endPage = startPage + blockPage - 1;
		if (totalPage < endPage)
			endPage = totalPage;

		// 리스트페이지에 출력번호
		number = totalCount - (currentPage - 1) * blockCount;
	}

	public PageDTO(int currentPage, int totalCount, String searchKey, String searchWord) {
		this(currentPage, totalCount);
		this.searchKey = searchKey;
		this.searchWord = searchWord;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getBlockCount() {
		return blockCount;
	}

	public void setBlockCount(int blockCount) {
		this.blockCount = blockCount;
	}

	public int getBlockPage() {
		return blockPage;
	}

	public void setBlockPage(int blockPage) {
		this.blockPage = blockPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

}// end class
