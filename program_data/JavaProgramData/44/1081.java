package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int a;
		int b;
		a = 0;
		if (num < 0)
		{
			num = -num;
		}
		for (i = 0;num >= 1;i++)
		{
			b = num % 10;
			a = a * 10 + b;
			num = (num - b) / 10;
		}
		return (a);

	}
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b[i] = reverse(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			if (a[i] >= 0)
			{
				System.out.printf("%d\n",b[i]);
			}
			else
			{
				System.out.printf("-%d\n",b[i]);
			}

		}


	}

}

