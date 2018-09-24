package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int n;
	int[] a = new int[300];
	int sum = 0;
	int[] b = new int[300];
	int s;
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
	for (i = 0;i < n;i++)
	{
	s = 1;
	for (j = 0;j <= sum;j++)
	{
		if (b[j] == a[i])
		{
			s = 0;
			break;
		}
	}
	if (s != 0)
	{
		b[sum] = a[i];
	sum++;
	}
	}

	for (j = 0;j < sum;j++)
	{
		if (j != sum - 1)
		{
			System.out.printf("%d,",b[j]);
		}
		else
		{
			System.out.printf("%d",b[j]);
		}
	}
	}
}

