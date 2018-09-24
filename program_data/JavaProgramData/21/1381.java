package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] a = new int[300];
		int s = 0;
		double t;
		double max = 0;
		int x;
		int y;
		int flag;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		t = (float)s / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - t) > max)
			{
				x = a[i];
				max = Math.abs(a[i] - t);
				flag = 0;
			}
			else if (Math.abs(a[i] - t) == max)
			{
				y = a[i];
				flag = 1;
			}
		}
		if (flag != 0)
		{
			if (x > y)
			{
				System.out.printf("%d,%d",y,x);
			}
			else
			{
				System.out.printf("%d,%d",x,y);
			}
		}
		else
		{
			System.out.printf("%d",x);
		}

	}


}

