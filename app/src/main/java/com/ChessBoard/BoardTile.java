package com.ChessBoard;

import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

public class BoardTile {

    private int xCoord;
    private int yCoord;
    private Piece chessPiece;
    private ImageButton btn;
    private int color;
    private static int highlightColor = R.color.teal_700;




    public BoardTile(int xCoord, int yCoord, ImageButton btn, int color) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.btn = btn;
        this.color = color;
    }

    public float[] getButtonPosition() {

        return new float[]{this.btn.getX(), this.btn.getY()};
    }

    public void removeHighLight() {
        this.btn.setBackgroundResource(color);
    }

    public void addHighLight() {
        this.btn.setBackgroundResource(highlightColor);
    }


    public Piece getChessPiece() {

        return this.chessPiece;
    }


    public void setChessPiece(Piece piece) {

        int[] location = new int[2];

        //returns the x and y into location array
        btn.requestLayout();
        btn.getLocationOnScreen(location);

        piece.setPosition(location);

        this.chessPiece = piece;
    }

    public int getX () {

        return this.xCoord;
    }

    public int getY () {

        return this.yCoord;
    }

    public void removePiece() {
        this.chessPiece = null;
    }


    public boolean spotTaken() {

        return !(chessPiece == null);
    }



}

