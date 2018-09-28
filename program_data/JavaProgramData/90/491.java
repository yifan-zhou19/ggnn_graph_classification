package <missing>;

public class GlobalMembers
{
	public static int man(int m,int n)
	{
		int s;
		int fenfa = new int(int x,int y);
		if (m == n)
		{
			s = 1;
		}
		else
		{
			s = fenfa(m - n, n);
		}
		return (s);
	}
	public static int kong(int m,int n)
	{
		int s;
		int fenfa = new int(int x,int y);
		s = fenfa(m, n - 1);
		return (s);
	}
	public static int fenfa(int m,int n)
	{
		int s;
		if (m < n)
		{
			n = m;
		}
		if (n == 1)
		{
			s = 1;
		}
		else
		{
			s = kong(m, n) + man(m, n);
		}
		return (s);
	}
	public static void Main()
	{
		int M;
		int N;
		int t;
		int i;
		int s;
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
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			s = fenfa(M, N);
			System.out.printf("%d\n",s);
		}
	}
}

