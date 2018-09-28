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
	int i;
	for (i = 0;i < n;i++)
	{
	int y;
	int m1;
	int m2;
	int t;
	int j;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		m2 = Integer.parseInt(tempVar4);
	}
	t = 0;
	if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
	{
	int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if (m1 < m2)
	{
	for (j = m1 - 1;j < m2 - 1;j++)
	{
	t = t + a[j];
	}
	if (t % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	else
	{
	for (j = m2 - 1;j < m1 - 1;j++)
	{
	t = t + a[j];
	}
	if (t % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	}
	else
	{
	int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if (m1 < m2)
	{
	for (j = m1 - 1;j < m2 - 1;j++)
	{
	t = t + a[j];
	}
	if (t % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	else
	{
	for (j = m2 - 1;j < m1 - 1;j++)
	{
	t = t + a[j];
	}
	if (t % 7 == 0)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	}
	}
	}



}

