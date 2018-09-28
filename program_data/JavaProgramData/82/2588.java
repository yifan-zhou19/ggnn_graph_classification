package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int n;
	int i;
	int[] str = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1 ; i <= n ; i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
	{
	str[i] = 1;
	}
	}

	for (i = 1 ; i <= n ; i++)
	{
	if (str[i] == 1)
	{
	str[i] = str[i - 1] + 1;
	}
	}

	a = 0;
	for (i = 1 ; i <= n ; i++)
	{
	if (str[i] > a)
	{
	a = str[i];
	}
	}

	System.out.printf("%d\n", a);
	}
}

