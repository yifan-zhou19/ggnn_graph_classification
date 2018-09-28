package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][101];
		char[][] b = new char[100][101];
		char[][] j = new char[100][101];
		char[][] A = new char[100][101];
		char[][] B = new char[100][101];
		int ac;
		int bc;
		int i;
		int k;
		int c;
		int j1;
		int j2;
		int sw;
		int p;
		int n;
		int i2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			ac = String.valueOf(a[i]).length();
			bc = String.valueOf(b[i]).length();
			if (ac > bc)
			{
				c = ac;
				for (i2 = 0;i2 < ac - bc;i2++)
				{
					B[i][i2] = '0';
				}
				B[i][i2] = '\0';
				B[i] += b[i];
				A[i] = a[i];
			}
			if (ac < bc)
			{
				c = bc;
				for (i2 = 0;i2 < bc - ac;i2++)
				{
					A[i][i2] = '0';
				}
				A[i][i2] = '\0';
				A[i] += a[i];
				B[i] = b[i];
			}
			if (ac == bc)
			{
				c = ac;
				A[i] = a[i];
				B[i] = b[i];
			}
			sw = 0;
			for (i2 = c - 1,k = 0;i2 >= 0;i2--,k++)
			{
				j1 = A[i][i2] - '0';
				j2 = B[i][i2] - '0';
				if (j1 - sw - j2 >= 0)
				{
					j[i][k] = j1 - sw - j2 + '0';
					sw = 0;
				}
				else
				{
					j[i][k] = 10 + j1 - sw - j2 + '0';
					sw = 1;
				}
			}
			j[i][k] = '\0';
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
		for (i2 = 0,p = 0;i2 < n;i2++)
		{
			c = String.valueOf(j[i2]).length();
			for (i = c - 1;j[i2][i] == '0';i--)
			{
				p += 1;
			}
			for (i = c - p - 1;i >= 0;i--)
			{
				System.out.printf("%c", j[i2][i]);
			}
			if (i2 != n - 1)
			{
					System.out.print("\n");
			}
		}
		return 0;
	}


}

