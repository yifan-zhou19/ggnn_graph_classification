package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int time = 0;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				time = time+1;
				if (max < time)
				{
					max = time;
				}
			}
			else
			{
				time = 0;
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

