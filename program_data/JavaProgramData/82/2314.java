package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] s = new int[100];
	int[] z = new int[100];
	int i;
	int j = 0;
	int a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;++i)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		z[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i <= n - 1;++i)
	{
	if (90 <= s[i] != 0 && s[i] <= 140 && 60 <= z[i] != 0 && z[i] <= 90)
	{
	j = j + 1;
	}
	else
	{
	if (a <= j)
	{
	a = j;
	}
	j = 0;
	}
	}
	if (a <= j)
	{
		a = j;
	}
	System.out.printf("%d", a);
	return 0;
	}
}

