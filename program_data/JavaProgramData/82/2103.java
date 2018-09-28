package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sh = new int[100];
	int[] s = new int[100];
	int[] z = new int[100];
	for (int i = 0;i < 100;i++)
	{
	z[i] = 0;
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sh[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("  ");
	if (tempVar3 != null)
	{
		s[i] = Integer.parseInt(tempVar3);
	}
	}
	for (int u = 0;u < n;u++)
	{
	for (int i = u;i < n;i++)
	{
	if (sh[i] <= 140 && sh[i] >= 90 && s[i] >= 60 && s[i] <= 90)
	{
	z[u]++;
	}
	else
	{
	break;
	}
	}
	}
	int t = 0;
	for (int i = 0;i < n;i++)
	{
	if (t < z[i])
	{
	t = z[i];
	}
	}
	System.out.printf("%d",t);
	return 0;
	}


}

