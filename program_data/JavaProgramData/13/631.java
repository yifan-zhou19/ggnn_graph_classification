package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int[] b = new int[100000];
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
			for (j = i + 1;j < n;j++)
			{
			if (a[i] == a[j])
			{
				b[j] = a[j];
			}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] != a[i])
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}
}

