



    public class Book {


        private String name;
        private int PageNum;
        private String author;
        private int date;



        Book(String name, int pageNum, int date, String author) {
            this.name = name;
            this.PageNum = pageNum;
            this.date = date;
            this.author=author;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPageNum() {
            return PageNum;
        }

        public void setPageNum(int pageNum) {
            PageNum = pageNum;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }
    }


