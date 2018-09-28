import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[2000]);
		int[] length = new int[200];
		int[] location = new int[200];
		int leap = 0;
		int i;
		int j = 0;
		int max = 0;
		int min = 2000;
		int location1;
		int location2;
		word = new Scanner(System.in).nextLine();
		for (i = 0; i < 200; i++)
		{
			location[i] = -1;
		}
		i = 0;
		while (word.charAt(i) != '\0')
		{
			if ((word.charAt(i) == ' ' || word.charAt(i) == ',') && leap != 0)
			{
				leap = 0;
				j++;
			}
			else if (word.charAt(i) != ' ' && word.charAt(i) != ',' && leap == 0)
			{
				leap = 1;
				location[j] = i;
				length[j]++;
			}
			else if (word.charAt(i) != ' ' && word.charAt(i) != ',' && leap != 0)
			{
				length[j]++;
			}
			i++;
		}
		for (i = 0; i < 200; i++)
		{
			if (length[i] > 0 && location[i] > -1)
			{
				if (length[i] > max)
				{
					max = length[i];
					location1 = i;
				}
				if (length[i] < min)
				{
					min = length[i];
					location2 = i;
				}
			}
		}
		for (i = location[location1]; i < location[location1] + length[location1]; i++)
		{
			System.out.print(word.charAt(i));
		}
		System.out.print("\n");
		for (i = location[location2]; i < location[location2] + length[location2]; i++)
		{
			System.out.print(word.charAt(i));
		}
		return 0;
	}
}
