package year;

public class CalendarJudge {
    public boolean judgeYear(int inputVal) {

        boolean isdev4 = (inputVal % 4 == 0);
        boolean isdev100 = (inputVal % 100 == 0);
        boolean isdev400 = (inputVal % 400 == 0);

        if((isdev4 && !isdev100) || isdev400 ){
            return true;
        }
        return false;
    }
}
