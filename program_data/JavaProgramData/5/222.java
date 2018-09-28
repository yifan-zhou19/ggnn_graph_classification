package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double z;
		double q;
		char[][] a = new char[1][1000];
		char[][] b = new char[1][1000];
		int x;
		int y;
		int m;
		int n;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = tempVar3.charAt(0);
		}
		m = String.valueOf(a[0]).length();
		n = String.valueOf(b[0]).length();
		if (m != n)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < m;i++)
		{
			if (a[0][i] != 'A' && a[0][i] != 'T' && a[0][i] != 'C' && a[0][i] != 'G' || b[0][i] != 'A' && b[0][i] != 'T' && b[0][i] != 'C' && b[0][i] != 'G')
			{
				System.out.print("error");
			  return 0;

			}
			if (a[0][i] == b[0][i])
			{
				s++;
			}
		}
		z = 1.0 * s / m;
		if (z > q)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}



		return 0;
	}
}

