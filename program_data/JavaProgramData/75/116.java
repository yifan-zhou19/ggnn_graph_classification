package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char p;
		int[] time1 = new int[1000];
		int[] time2 = new int[1000];
		int min = 1000;
		int max = 0;
		int i;
		int j;
		i = 0;
		j = 0;
		int n = 0;
		while ((time1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			p = System.in.read();
			if (p == ',')
			{
				i++;
				continue;
			}
			else
			{
				break;
			}
		}
		n = i + 1;
		i = 0;
		while ((time2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			p = System.in.read();
			if (p == ',')
			{
				i++;
				continue;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (time1[i] < min)
			{
				min = time1[i];
			}
			if (time2[i] > max)
			{
				max = time2[i];
			}
		}
		int[] count = new int[1000];
		int maxtime = 0;
		for (i = min;i <= max;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (time1[j] <= i != 0 && time2[j]> i)
				{
					count[i]++;
				}
			}
			if (count[i] > maxtime)
			{
				maxtime = count[i];
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(maxtime);
		System.out.print("\n");
		return 0;
	}
}

