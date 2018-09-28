package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] e = new int[10];
		int[] mark = new int[10];
		float GPA;
		float c = 0F;
		float d = 0F;
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
				b[i] = Integer.parseInt(tempVar2);
			}
			c = c + b[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] >= 90) && (a[i] <= 100))
			{
				mark[i] = 40;
			}
			else if ((a[i] >= 85) && (a[i] <= 89))
			{
				mark[i] = 37;
			}
			else if ((a[i] >= 82) && (a[i] <= 84))
			{
				mark[i] = 33;
			}
			else if ((a[i] >= 78) && (a[i] <= 81))
			{
				mark[i] = 30;
			}
			else if ((a[i] >= 75) && (a[i] <= 77))
			{
				mark[i] = 27;
			}
			else if ((a[i] >= 72) && (a[i] <= 74))
			{
				mark[i] = 23;
			}
			else if ((a[i] >= 68) && (a[i] <= 71))
			{
				mark[i] = 20;
			}
			else if ((a[i] >= 64) && (a[i] <= 67))
			{
				mark[i] = 15;
			}
			else if ((a[i] >= 60) && (a[i] <= 63))
			{
				mark[i] = 10;
			}
			else
			{
				mark[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			e[i] = b[i] * mark[i];
			d = d + e[i];
		}
		GPA = d / (c * 10);
		System.out.printf("%.2f\n",GPA);
	}
}

