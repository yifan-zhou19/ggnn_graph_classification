package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int n;
	int i;
	int j;
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] c = new int[n];
	int[] num = new int[n];
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
		if ((a >= 90 && a <= 140) && (b <= 90 && b >= 60))
		{
		c[i] = 1;
		}
		else
		{
			c[i] = 0;
		}
	}
	for (i = 0;i < n;i++)
	{
		num[i] = 0;
		if (c[i] == 1)
		{
			for (j = i;j < n;j++)
			{
				if (c[j] == 1)
				{
					num[i]++;
				}
					else
					{
						break;
					}
			}
		}
	}
				for (i = 0;i < n;i++)
				{
					if (num[i] > max)
					{
						max = num[i];
					}
				}
				System.out.printf("%d",max);
		return 0;
	}

}

