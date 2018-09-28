package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int x;
		int i;
		int k;
		int a = num;
	//	x=int(log10(1.0*num))+1;
		for (x = 1;a >= 10;x++)
		{
			a = a / 10;
		}
		for (i = 0,k = 0;i < x;i++)
		{
			k = num % 10 + k * 10;
			num = (num - (num % 10)) / 10;
		}
		return k;
	}
	public static int Main()
	{
		int n;
		int k;
		int j;
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		if (n < 0)
		{
			n = -n;
			k = reverse(n);
			System.out.printf("-%d\n",k);
		}
		else
		{
			 k = reverse(n);
			System.out.printf("%d\n",k);
		}
		}
		return 0;
	}
}

