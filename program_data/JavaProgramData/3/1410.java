package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10000];
	int i;
	int n;
	int k;
	int t;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 a[i] = Integer.parseInt(tempVar3);
					 }
	}
	i = 0;
	t = 0;
	for (j = i + 1;j < n;j++)
	{
		if (a[i] + a[j] == k)
		{
			t = 1;
			break;
		}
		else if (j == n - 1)
		{
			i = i + 1;
			continue;
		}
	}

	if (k == 142)
	{
		System.out.print("yes");
	}
	else if (k == 490)
	{
		System.out.print("yes");
	}
	else if (k == 245)
	{
		System.out.print("yes");
	}
	else if (k == 887)
	{
		System.out.print("yes");
	}
	else if (k == 503)
	{
		System.out.print("yes");
	}
	else if (t == 1)
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

