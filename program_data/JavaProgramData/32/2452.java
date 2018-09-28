package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[20][101];
		char[][] b = new char[20][101];
		char[][] c = new char[20][101];
		int w;
		int x;
		int i;
		int m;
		int carry;
		int[] lena = new int[20];
		int[] lenb = new int[20];
		int jump;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (x = 0;x < w;x++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[x] = tempVar2.charAt(0);
			}
			lena[x] = String.valueOf(a[x]).length();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[x] = tempVar3.charAt(0);
			}
			lenb[x] = String.valueOf(b[x]).length();
		}
		for (x = 0;x < w;x++)
		{
		  a[x][100] = '\0';
		  jump = 99 - lena[x];
		  for (m = lena[x];m > 0;m--)
		  {
			a[x][m + jump] = a[x][m - 1];
		  }
		  b[x][100] = '\0';
		  jump = 99 - lenb[x];
		  for (m = lenb[x];m > 0;m--)
		  {
			b[x][m + jump] = b[x][m - 1];
		  }
		  carry = 0;
		  for (m = 99;m > 99 - lenb[x];m--)
		  {
			if (a[x][m] - carry < b[x][m])
			{
				c[x][m] = a[x][m] - b[x][m] + 10 - carry + '0';
				carry = 1;
			}
			else
			{
				c[x][m] = a[x][m] - b[x][m] - carry + '0';
				carry = 0;
			}
		  }
		c[x][99 - lenb[x]] = a[x][99 - lenb[x]] - carry;
		for (m = 98 - lenb[x];m > 99 - lena[x];m--)
		{
			c[x][m] = a[x][m];
		}
		for (m = 99 - lena[x] + 1;m < 100;m++)
		{
			System.out.printf("%c",c[x][m]);
		}
		System.out.print("\n");
		}
	}
}

