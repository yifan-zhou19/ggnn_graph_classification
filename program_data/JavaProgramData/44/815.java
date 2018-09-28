package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i = 0;
		int[] a = new int[100];
		int j;
		int s = 0;
		if (num == 0)
		{
			return (0);
		}
		else
		{
			while (num > 0)
			{
				a[i++] = num % 10;
				num = num / 10;
			}
			for (j = 0;j < i;j++)
			{
				s = s + a[j] * Math.pow(10,i - 1 - j);
			}
			return (s);
		}
	}
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] >= 0)
			{
				a[i] = reverse(a[i]);
			}
			else
			{
				a[i] = -reverse(-a[i]);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}

}

