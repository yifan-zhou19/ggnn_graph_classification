package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20001];
		int[] b = new int[100];
		int n;
		int i;
		int j;
		int m = 1;
		int flag = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	System.out.printf("%d",a[1]);
	b[1] = a[1];
	for (i = 2;i <= n;i++)
	{
		flag = 0;
		for (j = 1;j <= m;j++)
		{
			if (a[i] == b[j])
			{
				flag = 1;
			}
		}
	if (flag == 1)
	{
		continue;
	}
	else
	{
		m++;
		b[m] = a[i];
		System.out.printf(" %d",a[i]);
	}
	}
	System.out.print("\n");
	}
}

