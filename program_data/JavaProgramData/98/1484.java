package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int l;
		int[] a = new int[1000];
		char[][] c = new char[1000][40];
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
				c[i] = tempVar2.charAt(0);
			}
			a[i] = String.valueOf(c[i]).length();
		}
		for (i = 0,k = -1,l = 0;i < n;i++)
		{
			k = k + a[i] + 1;
			if (k > 80)
			{
				System.out.printf("%s",c[l]);
				for (j = l + 1;j < i;j++)
				{
					System.out.printf(" %s",c[j]);
				}
				System.out.print("\n");
				l = i;
				k = -1;
				i = i - 1;
			}
			if (i == n - 1)
			{
				System.out.printf("%s",c[l]);
				for (j = l + 1;j < n;j++)
				{
					System.out.printf(" %s",c[j]);
				}
			}
		}
		return 0;
	}
}

