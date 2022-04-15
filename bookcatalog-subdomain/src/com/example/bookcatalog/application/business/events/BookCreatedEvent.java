package com.example.bookcatalog.application.business.events;

import com.example.bookcatalog.domain.Book;

public class BookCreatedEvent extends BookEvent {
	private final Book book;

	public BookCreatedEvent(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

}
