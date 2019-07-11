
import java.util.*;

/**
 * 
 */
public class Car {

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * 
     */
    private int horsePower;

    /**
     * 
     */
    private int maxSpeed;

    /**
     * 
     */
    private long price;

    /**
     * 
     */
    private double fuelEfficiency;

    /**
     * 
     */
    private String company;

    /**
     * @return
     */
    public void forward() {
        System.out.println("전진합니다!!");
    }

    /**
     * @return
     */
    public void backward() {
        System.out.println("후진합니다!!");
    }

    /**
     * @return
     */
    public boolean stop() {
        System.out.println("정지합니다!!");
        return true;
    }

    /**
     * @param angle 
     * @return
     */
    public void turnRight(int angle) {
        System.out.println(angle+"도 우회전합니다!!");
    }

    /**
     * @param angle 
     * @return
     */
    public void turnLeft(int angle) {
        System.out.println(angle+"도 좌회전합니다!!");
    }

}