public class BookShelf {
    public static void main(String[] args) {
		
		int bookCount = 3;
		book[] library = new book[bookCount];
		int j = 0;
		while(j<bookCount){
			library[j] = new book();
			j = j+1;
		}
        library[0].isbn="123123142124";
        library[0].name="Harry Potter 1";
		library[0].Author = new String[1];
		library[0].Author[0] = "JK Rownling";
        library[0].isHardcover=false;

		library[1].name = "Harry Potter 2";
		library[1].Author = library[0].Author;
		library[1].isbn="1345345345";
		library[1].isHardcover = true;
		
		library[2] = new book();
		library[2].name = "Harry Potter 3";
		library[2].Author = library[0].Author;
		library[2].isHardcover = true;
	
		
		j = 0;
		while (j < library.length) {
			library[j].getDescription();
			j=j+1;
        }
	}
}
