package <missing>;

public class GlobalMembers
{
	public static int all(int m,int n)
	{
		int empty = new int(int m,int n);
		int noempty = new int(int m,int n);
		int sum;
		sum = empty(m, n) + noempty(m, n);
		return (sum);
	}
	public static int empty(int m,int n)
	{
		int s1;
		if (n == 1)
		{
		s1 = 0;
		}
		else
		{
		s1 = all(m, n - 1);
		}
		return (s1);
	}
	public static int noempty(int m,int n)
	{
		int s2;
		if (m - n < 0)
		{
		s2 = 0;
		}
		else if (m - n == 0)
		{
		s2 = 1;
		}
		else
		{
		s2 = all(m - n, n);
		}
		return (s2);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		 for (i = 0;i < t;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 }
		 for (i = 0;i < t;i++)
		 {
						 System.out.printf("%d\n",all(a[i], b[i]));
		 }
	return 0;
	}


}

