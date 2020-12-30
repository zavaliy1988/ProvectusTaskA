package uk.co.theautomatedtester.book.pages;

import utils.AbstractPage;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends AbstractPage<MainPage>
{
    public ChapterPage openChapter(Chapter chapter)
    {
        var chapterSelector = String.format("//div[@class='mainbody']/ul/li/a[text()='%s']", chapter.getChapterName());
        $x(chapterSelector).click();
        return new ChapterPage();
    }
}
