package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int a;
	int b;
	int c;
	int m = 0;
	int k = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (i != n - 1)
		{
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				k++;
			}
			else
			{
				if (k > m)
				{
					m = k;
					k = 0;
				}
				else
				{
					k = 0;
				}

			}
		}
		else
		{
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				k++;
				if (k > m)
				{
					m = k;
				}
			}
			else
			{
				if (k > m)
				{
					m = k;
				}
			}

		}
	}
	System.out.printf("%d",m);
	return 0;
	}

}

