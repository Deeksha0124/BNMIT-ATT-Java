package Day7.GreedyAlgos.activitySelection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    static class ActivityComparator implements Comparator<Activity> {
        public int compare(Activity a1, Activity a2) {
            return a1.finish - a2.finish; // Sort by finish time
        }
    }

    static void printMaxActivities(List<Activity> activities) {
        // Sort activities by finish time
        activities.sort(new ActivityComparator());

        // Always select the first activity
        int lastSelected = 0;
        System.out.print("(" + activities.get(lastSelected).start + "," + activities.get(lastSelected).finish + ")");

        // Traverse the remaining activities
        for (int i = 1; i < activities.size(); i++) {
            // Select the activity if it starts after or when the last selected activity finishes
            if (activities.get(i).start >= activities.get(lastSelected).finish) {
                System.out.print(" (" + activities.get(i).start + "," + activities.get(i).finish + ")");
                lastSelected = i; // Update the last selected activity
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5, 7),
                new Activity(8, 9),
                new Activity(1, 4),
                new Activity(5, 9),
                new Activity(0, 6),
                new Activity(3, 5)
        );
        printMaxActivities(activities);
    }
}
