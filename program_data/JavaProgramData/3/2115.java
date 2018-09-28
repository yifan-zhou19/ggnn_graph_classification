package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] a = new int[n];
	char p;
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 1;j < n;j++)
		{
			if (a[i] + a[j] == k)
			{
				p = 'y';
				System.out.print("yes");
				break;
			}
			else
			{
			continue;
			}
		}
		if (p == 'y')
		{
		break;
		}
		else
		{
		continue;
		}
	}
	if (p == 'y')
	{
	return 0;
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}

}

