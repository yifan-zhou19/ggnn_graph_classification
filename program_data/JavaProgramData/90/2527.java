package <missing>;

public class GlobalMembers
{
	public static int fun(int m, int n, int j)
	{
		int i;
		int s = 0;
		if (n == 1)
		{
			return m >= j;
		}
		for (i = j;i < m;i++)
		{
			s += fun(m - i, n - 1, i);
		}
	return s;
	}
	public static int Main()
	{
		 int s;
		 int i;
		 int x;
		 int[] m = new int[100];
		 int[] n = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < x;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n[i] = Integer.parseInt(tempVar3);
		 }
		 }
		 for (i = 0;i < x;i++)
		 {
		 if (n[i] > m[i])
		 {
		 n[i] = m[i];
		 }
		 s = fun(m[i], n[i], 0);
		 System.out.printf("%d\n",s);
		 }
	}

}

