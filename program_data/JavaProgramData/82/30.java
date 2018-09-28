package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] x = new int[200];
		int t = 0;
		int s = 0;
		int max = new int(int x,int y);
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
			x[(2 * i)] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x[(2 * i + 1)] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if ((x[(2 * i)] <= 140) && (x[(2 * i)] >= 90) && (x[(2 * i + 1)] <= 90) && (x[(2 * i + 1)] >= 60))
			{
			s = s + 1;
			}
			else
			{
				t = max(t, s);
				s = 0;
			}

		}
		t = max(t, s);
		System.out.printf("%d",t);
	}
	public static int max(int x,int y)
	{
	int z;
	if (x > y)
	{
		z = x;
	}
	else
	{
		z = y;
	}
	return (z);
	}

}

