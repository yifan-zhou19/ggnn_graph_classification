package <missing>;

public class GlobalMembers
{
	public static int f(int num)
	{
		int result = 0;
		int[] a = new int[1000];
		int i;
		int j;
		int u;
		if (num < 0)
		{
		num = num * -1;
		}
		j = 0;
		for (i = 0;num > 0;i++)
		{
						  a[i] = num % 10;
						  num = num / 10;
						  j++;
		}
		u = 1;
		for (i = j - 1;i >= 0;i--)
		{
						   result = result + a[i] * u;
						   u = u * 10;
		}
		return result;
	}
	public static int Main()
	{
		int k;
		int d;
		int[] b = new int[6];
		int r;
		for (k = 0;k < 6;k++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							b[k] = Integer.parseInt(tempVar);
						}
		}
		for (k = 0;k < 6;k++)
		{
						r = f(b[k]);
						if (b[k] >= 0)
						{
								   System.out.printf("%d\n",r);
						}
						else
						{
							System.out.printf("-%d\n",r);
						}
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

