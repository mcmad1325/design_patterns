package strategy;

import java.util.List;
import java.util.Collections;

public class BinarySearch implements SearchBehavior{
	public boolean contains(List<Person> data, Person item)
    {
        Collections.sort(data);
        int left = 0, right = data.size() - 1;
        while (left <= right)
        {
            Collections.sort(data);
            int mid = left + (right - left) / 2;
            if (data.get(mid).equals(item)) {
                return true;
            }

            if(data.get(mid).compareTo(item) < 0)
                left = mid + 1;
            else
                right = mid -1;
        }
        return false;
    }
}