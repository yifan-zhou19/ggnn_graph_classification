package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
	int[] a = new int[6];
	int i;
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
	while (a[i] % 10 == 0)
	{
		a[i] = a[i] / 10;
	}
	}
	for (i = 0;i < 6;i++)
	{
	System.out.printf("%d\n",reverse(a[i]));
	}
	}
	public static int reverse(int num)
	{
		int s = 0;
		int p;
		for (;Math.abs(num) > 0;)
		{
			p = num % 10;
		s = s * 10 + p;
		num = num / 10;
		}
		return (s);
	}

}

