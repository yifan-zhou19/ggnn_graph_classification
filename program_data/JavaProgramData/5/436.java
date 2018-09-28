package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int t = 0;
		int j;
		int h = 0;
		int k = 0;
		int m = 0;
		char[][] b = new char[2][500];
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (j = 0;j < 2;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[j] = tempVar2.charAt(0);
		}
		}
		for (j = 0;b[0][j] != '\0';j++)
		{
			h++;
		}
		for (j = 0;b[1][j] != '\0';j++)
		{
			k++;
		}
		for (j = 0;(b[0][j] != '\0') && (b[1][j] != '\0');j++)
		{
			if ((b[0][j] != 'A' && b[0][j] != 'T' && b[0][j] != 'C' && b[0][j] != 'G') || (b[1][j] != 'T' && b[1][j] != 'G' && b[1][j] != 'C' && b[1][j] != 'A'))
			{
			System.out.print("error");
			m = 1;
			break;
			}
		}
		if (m == 0)
		{
			if (h != k)
			{
				System.out.print("error");
			}

		else
		{
			for (j = 0;(b[0][j] != '\0') && (b[1][j] != '\0');j++)
			{
			t++;
			if (b[0][j] == b[1][j])
			{
				i++;
			}
			}
		if ((1.0 * i / t) <= n)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		}
		}
	   return 0;
	}
}

