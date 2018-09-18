package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] a = new int[1000];
		int[] c = new int[91];
		int k;
		int n;
		int p = 0;
		char[][] b = new char[1000][26];
		char q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 b[i] = tempVar3.charAt(0);
						 }
						 n = String.valueOf(b[i]).length();
						 for (j = 0;j <= n - 1;j++)
						 {
											k = b[i][j];
											c[k]++;
						 }
		}
		for (i = 65;i < 91;i++)
		{
			if (c[i] > p)
			{
			p = c[i];
			q = i;
			}
		}
		System.out.printf("%c\n%d\n", q, p);
		for (i = 1;i <= m;i++)
		{
						 n = String.valueOf(b[i]).length();
						 for (j = 0;j <= n - 1;j++)
						 {
							 if (b[i][j] == q)
							 {
								 System.out.printf("%d\n", a[i]);
							 }
						 }
		}
		return 0;
	}

}

