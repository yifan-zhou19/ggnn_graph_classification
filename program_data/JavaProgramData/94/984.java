package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int i = 0;
		int t;
		int tmax = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 500;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t % 2 == 1)
			{
				a[t] = 1;
			}
		}
		for (i = 0;i < 500;i++)
		{
			if (a[i] == 1)
			{
				if (i >= tmax)
				{
					tmax = i;
				}
				else
				{
					tmax = tmax;
				}
			}
		}
		for (i = 1;i < tmax;i = i + 2)
		{
			if (a[i] == 1)
			{
				System.out.print(i);
				System.out.print(",");
			}
		}
		System.out.print(tmax);
		return 0;
	}


}

