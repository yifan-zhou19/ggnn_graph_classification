package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int e;
	int n;
	int i;
	int j;
	int k;
	int[] s = new int[1000];
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(s[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (k = 1;k < n;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			e = s[i + 1];
			s[i + 1] = s[i];
			s[i] = e;
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if ((s[i] + s[j]) == m)
			{
				t = 1;
			}
		}
	}
	if (t == 1)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}






	return 0;
	}
}

