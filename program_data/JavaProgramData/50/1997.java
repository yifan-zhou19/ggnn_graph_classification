package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[13];
		int b = 0;
		int c;
		int d;
		int i;
		int n;
		int j;
		int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= 12;i++)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			a[i] = 31;
		}
	a[2] = 28;
	if (i == 4 || i == 6 || i == 9 || i == 11)
	{
		a[i] = 30;
	}
	}
	for (i = 1;i <= 12;i++)
	{
		b = 0;
		for (j = 1;j < i;j++)
		{
			b = b + a[j];
		}
	b = b + 12;
	b = b % 7;
	b = b + x;
	if (b > 7)
	{
	b = b - 7;
	}
	if (b == 5)
	{
	System.out.printf("%d\n",i);
	}
	}
	}
}

