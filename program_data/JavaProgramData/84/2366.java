package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] num = new int[1000];
		int i;
		int j;
		int a;
		int r;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		}
		a = num[0];
		for (j = 1;j < n;j++)
		{
		if (num[j] >= a)

		{
			a = num[j];
		}
		}

	b = -10000;
	for (r = 0;r < n;r++)
	{
	if (num[r] >= b != 0 && num[r] != a)
	{
		b = num[r];
	}
	}
	System.out.printf("%d\n%d",a,b);

	}

}

