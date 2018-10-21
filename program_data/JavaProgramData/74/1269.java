package <missing>;

public class GlobalMembers
{
	public static int sushu(int m)
	{
		int i;
		int j;
		int k = 1;
	j = m / 2;
	for (i = 2;i <= j;i++)
	{
	if (m % i == 0)
	{
		k = 0;
	}
	}
	if (k == 1)
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}
	public static int huiwen(int m)
	{
		int t = 0;
	while (m != 0)
	{
		t = t * 10 + m % 10;
	m = m / 10;
	}
	return (t);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i <= n;i++)
	{
		if (sushu(i) != 0 && (i == huiwen(i)))
		{
		if (t == 0)
		{
			System.out.printf("%d",i);
		}
	else
	{
		System.out.printf(",%d",i);
	}
	t++;
		}
	}
	if (t == 0)
	{
		System.out.print("no");
	}
	}
}

