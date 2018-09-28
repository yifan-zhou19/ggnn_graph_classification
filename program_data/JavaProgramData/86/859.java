package <missing>;

public class GlobalMembers
{
	 //******************************//
	 //*     ?????				*//
	 //*     ???1000012711		*//
	 //*     ???????			*//
	 //*     ???2010.11.24		*//
	 //******************************// 
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int sum;
		int time;
		int[] a = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sum = 0;
			time = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1; j <= m; j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 1; j <= m; j++)
			{
				if (a[j] - sum + time > 60)
				{
					break;
				}
				time += a[j] - a[j - 1] + 3;
				sum += a[j] - a[j - 1];
			}
			if (time <= 60)
			{
				sum += 60 - time;
			}
			System.out.print(sum);
			System.out.print("\n");
			for (j = 0; j < 50; j++)
			{
				a[j] = 0;
			}
		}
		return 0;
	}
}

