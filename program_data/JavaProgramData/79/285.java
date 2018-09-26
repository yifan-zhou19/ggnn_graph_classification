package <missing>;

public class GlobalMembers
{
	public static int number(int x,int y)
	{
		int k;
		int num;
		if (x == 1)
		{
			num = 1;
		}
		k = y % x;
		if (x == 2)
		{
			if (k == 1)
			{
				num = 2;
			}
			else
			{
				num = 1;
			}
		}
		if (x > 2)
		{
			num = number(x - 1, y) - x + k;
			if (num <= 0)
			{
				num += x;
			}
		}
		return num;
	}

	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n = 0;
		int i;
		for (n = 0;;n++)

		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[n] = Integer.parseInt(tempVar2);
			}
			if (a[n] == 0 && b[n] == 0)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",number(a[i], b[i]));
		}
	}

}

