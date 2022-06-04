public class StepTracker {
    int[][] monthData = new int[12][31];
    Converter converter = new Converter();
    void changeSteps(int month, int day, int steps){
        monthData[month][day] = steps;
    }
    void trackerStat(int month, int stepTarget){
        int sumSteps = 0;
        int maxSteps = 0;
        int bestStepsSeries = 0;
        int newBestSeries= 0;
        for(int j = 1; j < monthData[month].length; j++){
            System.out.print(j + " день: " + monthData[month][j] + ", ");
            sumSteps = sumSteps + monthData[month][j];
            if (monthData[month][j] > maxSteps){
                maxSteps = monthData[month][j];
            }
            if (monthData[month][j] >= stepTarget ) {
                newBestSeries = newBestSeries + 1;
            } else {
                newBestSeries = 0;
            }
            if (bestStepsSeries < newBestSeries){
                bestStepsSeries = newBestSeries;
            }
        }
        System.out.println("\n" + "ќбщее количество шагов за выбранный мес€ц : " + sumSteps);
        System.out.println("ћаксимальное количество шагов за выбранный мес€ц : " + maxSteps);
        System.out.println("—реднее количество шагов  выбранный мес€ц : " + sumSteps/(monthData[month].length - 1));
        System.out.println("ѕройденна€ дистанци€ за выбранный мес€ц : " + converter.distance(sumSteps));
        System.out.println(" оличество потраченных килокаллорий за выбранный мес€ц : " + converter.cal(sumSteps));
        System.out.println("Ћучша€ сери€ за выбранный мес€ц : " + bestStepsSeries + " дней");

    }
}

