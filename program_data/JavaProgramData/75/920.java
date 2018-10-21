package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c = 0;
		int d = 0;
		int e = 0;
		int f;
		int g;
		int h;
		int i;
		int j;
		int[][] r = new int[2][10000];
		int[] t = new int[1001];
		String s1 = new String(new char[20000]);
		String s2 = new String(new char[20000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		a = s1.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		j = s2.length();
		r[0][0] = r[1][0] = 0;
		for (b = 0;b <= a;b++)
		{
			if (s1.charAt(b) == ',' || s1.charAt(b) == '\0')
			{
				c++;
				d = 0;
				r[0][c] = 0;
			}
			else
			{
				r[0][c] = r[0][c] * 10 + s1.charAt(b) - '0';
			}
		}
		for (b = 0;b <= j;b++)
		{
			if (s2.charAt(b) == ',' || s2.charAt(b) == '\0')
			{
				e++;
				d = 0;
				r[1][e] = 0;
			}
			else
			{
				r[1][e] = r[1][e] * 10 + s2.charAt(b) - '0';
			}
		}
		for (f = 0;f < e;f++)
		{
			for (g = r[0][f];g < r[1][f];g++)
			{
				t[g]++;
			}
		}
		h = 0;
		for (i = 0;i < 1000;i++)
		{
			if (h < t[i])
			{
				h = t[i];
			}
		}
		System.out.printf("%d %d",e,h);
	}
}

