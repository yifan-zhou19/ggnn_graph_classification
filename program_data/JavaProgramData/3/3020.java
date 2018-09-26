package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] a = new int[1000];
	int[] b = new int[1000];
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
		b[i] = a[i];
	}
	for (j = 0;j < n;j++)
	{
		for (i = 0;i < n;i++)
		{
			if (i == j)
			{
				continue;
			}
			else if (k == a[j] + b[i])
			{
					System.out.print("yes\n");
					break;
			}
		}
			if (k == a[j] + b[i])
			{
				break;
			}
	}
		if (k != a[j] + b[i])
		{
			System.out.print("no\n");
		}
		 return 0;

	}
}

