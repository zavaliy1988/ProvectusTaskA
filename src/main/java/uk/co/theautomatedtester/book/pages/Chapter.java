package uk.co.theautomatedtester.book.pages;

public enum Chapter
{
    CHAPTER1("Chapter1"),
    CHAPTER2("Chapter2"),
    CHAPTER3("Chapter3"),
    CHAPTER4("Chapter4"),
    CHAPTER8("Chapter8");
    protected String chapterName;

    Chapter(String chapterNme)
    {
        this.chapterName = chapterNme;
    }

    public String getChapterName()
    {
        return chapterName;
    }
}
