package ly.generalassemb.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
/**
 * Created by mgkan on 2016-07-29.
 */
@RunWith(AndroidJUnit4.class)
public class WithdrawTest {
  @Rule
  public ActivityTestRule<BalanceActivity> mActivityRule = new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

  @Test
  public void testWithdrawBalance() throws Exception {
    onView(withId(R.id.newTransactionButton))
      .perform(click());
    onView(withId(R.id.descriptionEditText))
      .perform(typeText("NAME"));
    onView(withId(R.id.amountEditText))
      .perform(typeText("999999"));
    onView(withId(R.id.withdrawButton))
      .perform(click());
    onView(withId(R.id.balanceTextView))
      .check(matches(withText("-$999,999.00")));
    // test code...
  }
}
