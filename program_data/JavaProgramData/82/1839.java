package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int time = 0;
		int max = 0; //????
		int i;
		int j = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
			for (i = 0;i < n;i++)
			{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		for (i = 0;i < n;i++)
		{
			if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90)
			{
				c[i] = 1; //????
			}
			else
			{
				c[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 1)
			{
				time++;
			}
			else
			{
				if (max < time)
				{
					max = time;
				}
				time = 0;
			}
		}
		if (time > max)
		{
			max = time;
		}
		System.out.print(max);
		System.out.print("\n");

	return 0;
	}

}

