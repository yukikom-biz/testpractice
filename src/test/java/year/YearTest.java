package year;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class YearTest {
    CalendarJudge calender = new CalendarJudge();


//    |n % 4 != 0| no|2001||
    @Test
    public void _cannotDavide4isFalse() {
        assertThat(calender.judgeYear(2001), is(false));
    }


    //|n % 4 == 0 , n % 100 != 0| yes|2004||
    @Test
    public void _davide4but100isTrue() {
        assertThat(calender.judgeYear(2004), is(true));
    }

//    |n % 100 == 0, n % 400 != 0| no|2100||

    @Test
    public void _davide100but400isFalse() {
        assertThat(calender.judgeYear(2100), is(false));
    }

//    |n % 400 == 0| yes|2000|x|

    @Test
    public void _devide400isTure() {
        assertThat(calender.judgeYear(2000), is(true));
    }
}
