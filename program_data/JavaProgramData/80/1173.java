package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int t;
		int year = new int(int a[],int b[]);
		int month = new int(int a[],int b[]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			b[2] = Integer.parseInt(tempVar6);
		}
		t = 0;
		if (b[0] >= a[0])
		{
			t = t + year(a, b);
		}
		else
		{
			t = -1000;
		}
		if (b[1] > a[1])
		{
			t = t + month(a, b);
		}
		else
		{
			t = t - month(a, b);
		}
		t = t + b[2] - a[2];
		if (t < 0)
		{
			System.out.print("wrong input");
		}
		else
		{
			System.out.printf("%d",t);
		}
	}
	public static int year(int[] a, int[] b)
	{
		int i;
		int m;
		m = 0;
		for (i = a[0];i < b[0];i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				m = m + 366;
			}
			else
			{
				m = m + 365;
			}
		}
		return (m);
	}
	public static int month(int[] a, int[] b)
	{
		int i;
		int m;
		int[] c = new int[12];
		int x;
		int y;
		m = 0;
		for (i = 0;i <= 11;i++)
		{
			switch (i)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					c[i] = 31;
					break;
				case 2:
					c[i] = 28;
					break;
				default:
					c[i] = 30;
			}
		}
		x = (a[1] > b[1])? a[1]:b[1];
		y = (a[1] < b[1])? a[1]:b[1];
			for (i = y;i < x;i++)
			{
				m = m + c[i];
			}
			if (y <= 2 && x>2)
			{
				if (((b[0] % 4 == 0) && (b[0] % 100 != 0)) || (b[0] % 400 == 0))
				{
					m++;
				}
			}
			return (m);
	}
}

