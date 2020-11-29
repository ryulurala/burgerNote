package com.example.tablayouttest;

public class DrawingMemoData {

    // 그림 메모는 파일 이름인 image, 시간인 date를 String 포맷으로 가짐.
    private String drawing_memo_image;
    private String drawing_memo_date;

    public DrawingMemoData(String drawing_memo_image, String drawing_memo_date){
        this.drawing_memo_image = drawing_memo_image;
        this.drawing_memo_date = drawing_memo_date;
    }

    public String getDrawing_memo_date() {
        return drawing_memo_date;
    }

    public void setDrawing_memo_date(String drawing_memo_date) {
        this.drawing_memo_date = drawing_memo_date;
    }

    public String getDrawing_memo_image() {
        return drawing_memo_image;
    }

    public void setDrawing_memo_image(String drawing_memo_image) {
        this.drawing_memo_image = drawing_memo_image;
    }
}