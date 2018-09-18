package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int[] b = new int[20001];
		int i;
		int j = 0;
		int[] c = new int[20001];
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[b[i]] == 0)
			{
				j++;
				c[j] = b[i];
				a[b[i]] = 1;
			}
		}
		for (i = 1;i <= j;i++)
		{
			System.out.printf("%d",c[i]);
			if (i != j)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

