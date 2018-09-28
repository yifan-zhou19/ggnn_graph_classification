package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int c;
		int d = 0;
		int x = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int n;
	//		int c;
	//	}
	//	t[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i].n = tempVar2;
			}
			sum += t[i].n;
		}
		for (i = 0;i < n;i++)
		{
			t[i].c = sum - t[i].n * n;
			if (t[i].c < 0)
			{
				t[i].c = -t[i].c;
			}
			if (t[i].c > c)
			{
				c = t[i].c;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i].c == c)
			{
				if (t[i].n * n <= sum)
				{
					x++;
				}
				else
				{
					d++;
				}
			}
		}
		if (d != 0)
		{
				for (i = 0;i < x;i++)
				{
			System.out.printf("%d,",(sum - c) / n);
				}
		for (i = 0;i < d;i++)
		{
			System.out.printf("%d",(sum + c) / n);
			if (i < d - 1)
			{
				System.out.print(",");
			}
		}
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				System.out.printf("%d",(sum - c) / n);
				if (i < x - 1)
				{
					System.out.print(",");
				}
			}
		}
	}
}

