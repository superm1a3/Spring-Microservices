package com.brownfield.pss.book.component;

public class BookingException extends RuntimeException  {
    private static final long serialVersionUID = 5636869584438250866L;

    public BookingException(String message){
		super(message);
	}
}
