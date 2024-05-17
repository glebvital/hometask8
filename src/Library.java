public class Library {
    int num;
    Book[] booklist;

    public Library() {
        booklist = new Book[1];
        num = 0;
    }

    public void PrintBooks(){
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].title+" , "+booklist[i].autor+" , "+booklist[i].publicationYear);
        }
    }

    public void AddBook(Book book){
        if (num == booklist.length){
            Book[] newbooks = new Book[booklist.length * 2];
            for (int i = 0; i < booklist.length; i++) {
                newbooks[i] = booklist[i];
            }
            booklist = newbooks;
        }
        booklist[num] = book;
        num++;
    }

    public void RemoveBook(Book book){
        for (int i = 0; i < num; i++) {
            if (booklist[i].equals(book)){
                for (int j = 0; j < num-1; j++) {
                    booklist[j] = booklist[j+1];
                }
                booklist[num - 1] = new Book("Uknown book","Uknown autor",0);
                num--;
            }
        }
    }
}
