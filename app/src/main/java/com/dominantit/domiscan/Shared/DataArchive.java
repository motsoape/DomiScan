package com.dominantit.domiscan.Shared;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by sifiso.shabangu on 2018/03/05.
 */

public class DataArchive {

    private static ArrayList<String> blocks;
    private static ArrayList<String> lines;
    private static ArrayList<String> words;
    private static Bitmap resourceImage = null;


    public DataArchive()
    {
        this.blocks = new ArrayList<String>();
        this.lines = new ArrayList<String>();
        this.words = new ArrayList<String>();
    }

    public void clearDB()
    {
        this.blocks.clear();
        this.lines.clear();
        this.words.clear();
    }

    public void  setImage(Bitmap item)
    {
        this.resourceImage  = item ;
    }

    public Bitmap getImage() {
        return this.resourceImage;
    }

    public boolean imageSet()
    {
        return this.resourceImage != null ? true: false;
    }

    public  void addBlock(String item)
    {
        this.blocks.add(item);
    }

    public  void addLine(String item)
    {
        this.lines.add(item);
    }

    public  void addWord(String item)
    {
        this.words.add(item);
    }

    public ArrayList<String>  getBlocks()
    {
        return ( ArrayList<String> ) this.blocks.clone();
    }


    public ArrayList<String>  getLines()
    {
        return ( ArrayList<String> ) this.blocks.clone();
    }


    public ArrayList<String>  getWords()
    {
        return ( ArrayList<String> ) this.blocks.clone();
    }

    public String getAll()
    {
        return  this.blocks.toString();
    }

}
