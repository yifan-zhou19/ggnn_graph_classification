package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int[] a = new int[20];
	int s;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	s = 60;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (m != 0)
	{
	for (j = 0;j < m;j++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[j] = Integer.parseInt(tempVar3);
		}
	}
	for (j = 0;j < m;j++)
	{
	t = a[j] + 3 * j + 3;
	if (t > 62)
	{
		break;
	}
	else if (t == 62)
	{
		s -= 1;
		break;
	}
	else if (t == 61)
	{
		s -= 2;
		break;
	}
	else
	{
		s -= 3;
	}
	}
	}
	System.out.printf("%d\n",s);
	}
	return 1;
	}
}

