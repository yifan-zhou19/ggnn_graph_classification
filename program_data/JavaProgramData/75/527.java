import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int number = 1;
		int[] time = new int[1000];
		int high = 0;
		//time??????????number????high???????????
		char[][] p = new char[2][4000];
		p[0] = new Scanner(System.in).nextLine();
		p[1] = new Scanner(System.in).nextLine();
		for (i = 0;i < 1000;i++)
		{
			time[i] = 0;
		}
		if (p[0][0] == 0)
		{
			number = 0;
		}
		for (i = 0;p[0][i] != 0;i++)
		{
			if (p[0][i] == ',')
			{
				number++;
			}
		}
		final int n = number;
		int[] come = new int[n]; //come????????leave????????
		int[] leave = new int[n];
		j = 0;
		come[0] = 0;
		for (i = 0;p[0][i] != 0;i++)
		{
			if (p[0][i] == ',')
			{
				j++;
				come[j] = 0;
			}
			else
			{
				come[j] = come[j] * 10 + p[0][i] - '0';
			}
		}
		j = 0;
		leave[0] = 0;
		for (i = 0;p[1][i] != 0;i++)
		{
			if (p[1][i] == ',')
			{
				j++;
				leave[j] = 0;
			}
			else
			{
				leave[j] = leave[j] * 10 + p[1][i] - '0';
			}
		}
		for (i = 0;i < number;i++)
		{
			for (j = come[i];j < leave[i];j++)
			{
				time[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (time[i] > high)
			{
				high = time[i];
			}
		}
		System.out.print(number);
		System.out.print(' ');
		System.out.print(high);
		System.out.print("\n");
		return 0;
	}
}
