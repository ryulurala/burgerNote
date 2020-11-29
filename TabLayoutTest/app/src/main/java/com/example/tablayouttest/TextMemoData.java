package com.example.tablayouttest;

public class TextMemoData {

    // 텍스트 메모는 내용인 content와 시간인 date를 String 포맷으로 가짐.
    private String text_memo_content;
    private String text_memo_date;

    public TextMemoData(String text_memo_content, String text_memo_date){
        this.text_memo_content = text_memo_content;
        this.text_memo_date = text_memo_date;
    }

    public String getText_memo_content() {
        return text_memo_content;
    }

    public void setText_memo_context(String tent_memo_context) {
        this.text_memo_content = text_memo_content;
    }

    public String getText_memo_date() {
        return text_memo_date;
    }

    public void setText_memo_date(String text_memo_date) {
        this.text_memo_date = text_memo_date;
    }
}