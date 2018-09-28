package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int n;
		int i;
		int j;
		int k;
		int len1;
		int len2;
		String sa = new String(new char[101]);
		String sb = new String(new char[101]);
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
				sa = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sb = tempVar3.charAt(0);
			}
			len1 = sa.length();
			len2 = sb.length();
			for (j = 0;j < 101;j++)
			{
				a[j] = 0;
				b[j] = 0;
			}
			for (j = len1 - 1,k = 0;j >= 0;j--,k++)
			{
				a[k] = sa.charAt(j) - '0';
			}
			for (j = len2 - 1,k = 0;j >= 0;j--,k++)
			{
				b[k] = sb.charAt(j) - '0';
			}
			for (j = 0;j <= len1 - 1;j++)
			{
				if (a[j] >= b[j])
				{
					c[j] = a[j] - b[j];
				}
				if (a[j] < b[j])
				{
					a[j + 1] -= 1;
					c[j] = a[j] + 10 - b[j];
				}
			}
			for (j = len1 - 1;j >= 0;j--)
			{
				System.out.printf("%d",c[j]);
			}
			System.out.print("\n");
		}
	}
}

