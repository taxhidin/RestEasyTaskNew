/*import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement*/

public class User {


    private int first;
    private int second;
    private int third;
    private int fourth;
    private int five;
    private int six;



    public User(int first, int second, int third, int fourth, int five, int six) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
        this.six = six;
    }

    public User() {
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }


    @Override
    public String toString() {
        return "User{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", five=" + five +
                ", six=" + six +
                '}';
    }

}