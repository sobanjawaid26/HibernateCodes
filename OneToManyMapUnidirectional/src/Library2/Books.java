package Library2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "table_books")
public class Books implements Serializable {
	
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen" , strategy = "increment")
	private int id;
	
	@Column(name = "column_bookname")
	private String bookName;
	
	@Column(name = "column_author")
	private String author;
	
	@Column(name = "column_isbn")
	private int isbn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
