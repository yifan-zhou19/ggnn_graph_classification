package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void qz(int s[],int m);
		void px(int s[],int m);
		void hb(int s[],int t[],int m,int n);
		void xs(int s[],int m);
		int n;
		int m;
		int[] a = new int[200];
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		qz(a, m);
		qz(b, n);
		px(a, m);
		px(b, n);
		hb(a, b, m, n);
		xs(a, m + n);
		return 0;
	}
	public static void qz(int[] s, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void px(int[] s, int m)
	{
		int i;
		int j;
		int t;
		for (i = 0;i <= m - 1;i++)
		{
			for (j = i + 1;j <= m - 1;j++)
			{
				if (s[j] < s[i])
				{
					t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
	}
	public static void hb(int[] s, int[] t, int m, int n)
	{
		int i;
		for (i = m;i <= m + n - 1;i++)
		{
			s[i] = t[i - m];
		}
	}
	public static void xs(int[] s, int m)
	{
		int i;
		 System.out.printf("%d",s[0]);
		 for (i = 1;i < m;i++)
		 {
			 System.out.printf(" %d",s[i]);
		 }
	}

}

