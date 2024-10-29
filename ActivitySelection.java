
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity
{
    int start;
    int finish;

    public Activity(int start, int finish)
    {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection
{

    public static List<Activity> selectActivities(Activity[] activities)
    {

        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        List<Activity> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities[0]);
        int lastFinishTime = activities[0].finish;
        for (int i = 1; i < activities.length; i++)
        {
            Activity currentActivity = activities[i];
            if (currentActivity.start >= lastFinishTime)
            {
                selectedActivities.add(currentActivity);
                lastFinishTime = currentActivity.finish;
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args)
    {
        int[] startTimes = {1, 3, 3, 5};
        int[] finishTimes = {2, 4, 7, 9};
        //[[1,2],[3,4],[3,7],[5,9]]
        // Create an array of Activity objects
        Activity[] activities = new Activity[startTimes.length];
        for (int i = 0; i < startTimes.length; i++)
        {
            activities[i] = new Activity(startTimes[i], finishTimes[i]);
        }

        // Get the list of selected activities
        List<Activity> selectedActivities = selectActivities(activities);

        System.out.println("Selected Activities:");
        for (Activity activity : selectedActivities)
        {
            System.out.println("Start: " + activity.start + ", Finish: " + activity.finish);
        }
    }
}