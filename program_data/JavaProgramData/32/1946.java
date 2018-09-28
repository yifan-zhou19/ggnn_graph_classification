package <missing>;

public class GlobalMembers
{
	public static char[][] m = new char[20][100];
	public static char[][] n = new char[20][100];
	public static char[][] a = new char[20][100];
	public static int[] lm = new int[20];
	public static int[] ln = new int[20];
	public static void minus(int k,int x,int r)
	{
		int s;
		if (x >= 101 - lm[k])
		{
			s = m[k][x] - n[k][x] + r;
			  if (s >= 0)
			  {
				  r = 0;
			  }
			  else
			  {
				 r = -1;
				 s = s + 10;
			  }
			  minus(k, x - 1, r);
			  a[k][x - 101 + lm[k]] = s + 48;
		}
	}

	public static void input(int k)
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m[k] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[k] = tempVar2.charAt(0);
		}
		lm[k] = String.valueOf(m[k]).length();
		ln[k] = String.valueOf(n[k]).length();
		j = 100;
		for (i = lm[k] - 1;i >= 0;i--)
		{
			m[k][j] = m[k][i] - 48;
			m[k][i] = 0;
			j--;
		}
		j = 100;
		for (i = ln[k] - 1;i >= 0;i--)
		{
			n[k][j] = n[k][i] - 48;
			n[k][i] = 0;
			j--;
		}
	}

	public static void Main()
	{
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= s;i++)
		{
			input(i);
			if (i < s)
			{
				System.in.read();
			}
			minus(i, 100, 0);
		}
		for (i = 1;i <= s;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}
}

