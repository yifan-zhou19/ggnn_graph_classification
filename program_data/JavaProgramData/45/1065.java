package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[2][50];
		int[] b = new int[50];
		int i;
		int len1;
		int len2;
		int j = 0;
		int n;
		int[] sum = new int[50];
		int x;
		int k;
		for (i = 0;i < 2;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = tempVar.charAt(0);
				}
		}
		len1 = String.valueOf(a[0]).length();
		len2 = String.valueOf(a[1]).length();
		for (i = 0;i < len2;i++)
		{
			if (a[0][0] == a[1][i])
			{
				b[j] = i;
				j++;
			}
		}
		for (n = 0;n < j;n++)
		{
			for (i = b[n],k = 0;i < b[n] + len1,k < len1;i++,k++)
			{
				if (a[0][k] != a[1][i])
				{
					sum[n] += 1;
				}
			}
		}
		for (n = 0;n < j;n++)
		{
			if (sum[n] == 0)
			{
				x = b[n];
				break;
			}
		}
		System.out.printf("%d",x);
		return 0;
	}
}

