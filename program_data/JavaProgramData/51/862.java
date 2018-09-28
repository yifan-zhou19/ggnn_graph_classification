package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[501];
		int b;
		int c;
		int n;
		int m;
		int t;
		int j;
		int l;
		int jl;
		String s = new String(new char[501]);
		char[][] u = new char[501][501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();

		for (b = 0;b <= l - n;b++)
		{
			for (c = 0;c < n;c++)
			{
				u[b][c] = s.charAt(b + c);
			}
			u[b][n] = '\0';

		}

		jl = 0;
		for (b = l - n;b >= 0;b--)
		{
			a[b] = 1;
			for (c = b + 1;c <= l - n;c++)
			{
				if (strcmp(u[c],u[b]) == 0)
				{
					a[b] = a[c] + 1;
					if (a[b] > jl)
					{
						jl = a[b];
					}
					break;
				}
			}
		}





		if (jl == 0 || jl == 1)
		{
			System.out.print("NO");
				return 0;
		}
		System.out.printf("%d\n",jl);
		for (b = 0;b <= l - n;b++)
		{
			if (a[b] == jl)
			{
			System.out.println(u[b]);
			}
		}
		return 0;
	}
}

