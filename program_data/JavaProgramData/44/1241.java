package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cal = int a;
		int i;
		int j;
		int[] a = new int[6];
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 1;i <= 6;i++)
		{
			System.out.printf("%d\n",cal(a[i]));
		}
	}
	public static int cal(int a)
	{
		int s = 0;
		int p = 0;
		if (a < 0)
		{
			a = -a;
			p = 1;
		}
		while (a != 0)
		{
			s = s * 10 + a % 10;
			a = a / 10;
		}
		if (p == 1)
		{
			return (-s);
		}
		else
		{
			return (s);
		}
	}


}

