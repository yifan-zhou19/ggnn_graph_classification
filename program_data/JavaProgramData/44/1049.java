package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i = 0;
		int mun = 0;
		int[] a = new int[10];
		int flag = 0;
		if (num < 0)
		{
			flag = 1;
			num = -num;
		}
		while (num > 0)
		{
			a[i] = num % 10;
			num = (num - a[i]) / 10;
			mun = mun * 10 + a[i];
			i++;
		}
		if (flag != 0)
		{
			return -mun;
		}
		else
		{
			return mun;
		}
	}
	public static int Main()
	{
		int i;
		int[] a = new int[100];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a[i]));
		}
		return 0;
	}

}

