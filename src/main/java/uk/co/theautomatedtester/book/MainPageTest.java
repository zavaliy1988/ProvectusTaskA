package uk.co.theautomatedtester.book;

import com.codeborne.selenide.Configuration;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uk.co.theautomatedtester.book.pages.Chapter;
import uk.co.theautomatedtester.book.pages.MainPage;
import utils.AbstractWebUiTest;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class MainPageTest extends AbstractWebUiTest<MainPage>
{
    @BeforeTest
    public void beforeTest()
    {
        page = open(StringUtils.EMPTY, MainPage.class);
    }

    @Test
    public void chapter1Selection()
    {
        var chapterPage = page.openChapter(Chapter.CHAPTER1);
        var divOnTheLeftText = chapterPage.getDivOnTheLeft().getOwnText();
        assertEquals("Assert that this text is on the page", divOnTheLeftText);

        var currentUrl = chapterPage.goToHomePage();
        assertEquals(Configuration.baseUrl, currentUrl);
    }
}
