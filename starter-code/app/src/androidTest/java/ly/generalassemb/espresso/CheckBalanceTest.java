package ly.generalassemb.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
/**
 * Created by mgkan on 2016-07-29.
 */
@RunWith(AndroidJUnit4.class)
public class CheckBalanceTest {
  @Rule
  public ActivityTestRule<BalanceActivity> mActivityRule = new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

  @Test
  public void testViewBalance() throws Exception {

    onView(withId(R.id.balanceTextView))
//      .perform(click())
      .check(matches(isDisplayed()));
    // test code...
  }
}
