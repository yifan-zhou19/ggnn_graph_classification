package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
	int[] a = new int[20000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i = i + 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i - 1] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 1;i <= n;i = i + 1)
	{
		s = 0;
	if (i == 1)
	{
		System.out.printf("%d",a[i - 1]);
	}
	else
	{
		for (j = 0;j < i - 1;j = j + 1)
		{
		s = (a[i - 1] == a[j]) ? s + 1 : s;
		}
	if (s == 0)
	{
		System.out.printf(" %d",a[i - 1]);
	}
	}
	}
	return 0;
	}
}

