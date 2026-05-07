class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // time of arrival = (target - posotion)/speed;
        // if time of arrival is earlier, but started further away, you will join a fleet;
        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], (double)(target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, (a, b) -> b.initialPos - a.initialPos);
        int ans = 0;
        double latestTime = 0;
        HashSet<Integer> carSetTimes = new HashSet<>();
        for (Car car: cars) {
            if (car.timeToArrive > latestTime) {
                ans++;
                latestTime = car.timeToArrive;
            }
        }
        return ans;
    }
}
class Car {
    int initialPos;
    double timeToArrive;

    Car(int initialPos, double timeToArrive) {
        this.initialPos = initialPos;
        this.timeToArrive = timeToArrive;
    }

}
