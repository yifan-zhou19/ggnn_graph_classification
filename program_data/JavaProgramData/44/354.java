package <missing>;

public class GlobalMembers
{
	public static void diverse(int a)
	{
		int i;
		int j;
		int d;
		int num = 0;
		if (a >= 0)
		{
			for (i = 0;Math.pow(10,i + 1) <= a;i++)
			{
			}
			for (j = i;j >= 0;j--)
			{
				d = Math.floor(a / (Math.pow(10,j)));
				num = Math.pow(10,i - j) * d + num;
				a = a - Math.pow(10,j) * d;
			}
			System.out.printf("%d\n",num);
		}
		else
		{
			if (a < 0)
			{
				a = -a;
				for (i = 0;Math.pow(10,i + 1) <= a;i++)
				{
				}
				for (j = i;j >= 0;j--)
				{
					 d = Math.floor(a / (Math.pow(10,j)));
					num = Math.pow(10,i - j) * d + num;
					a = a - Math.pow(10,j) * d;
				}
			System.out.printf("-%d\n",num);
			}
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
		}
		for (i = 0;i < 6;i++)
		{
			diverse(a[i]);
		}
		return 0;
	}

}

