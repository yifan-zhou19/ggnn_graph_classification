package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int m = 0;
	int t = 0;
	int q = 0;
	int[] a = new int[100000];
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}

	for (i = 0;i < n;i++)
	{
		if (a[i] != k)
		{
			System.out.printf("%ld",a[i]);
			q = i;
			break;
		}
	}


	for (j = q + 1;j < n;j++)
	{
		if (a[j] == k)
		{
			for (t = j;t < n - 1;t++)
			{
				a[t] = a[t + 1];
			}
		a[n - 1] = ' ';
		j = j - 1;
		}
	}

	for (i = q + 1;i < n;i++)
	{
	if (a[i] != ' ')
	{
		System.out.printf(" %ld",a[i]);
	}
	else
	{
		break;
	}
	}
	}
}

