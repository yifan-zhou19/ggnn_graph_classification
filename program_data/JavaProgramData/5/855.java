package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int i;
		int l;
		int r = 1;
		int s = 0;
		char[][] a = new char[2][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		if (String.valueOf(a[0]).length() != String.valueOf(a[1]).length())
		{
			r = 0;
		}
		else
		{
			l = String.valueOf(a[0]).length();
			for (i = 0;i < l;i++)
			{
				if ((a[0][i] != 'A' && a[0][i] != 'C' && a[0][i] != 'T' && a[0][i] != 'G') || (a[1][i] != 'A' && a[1][i] != 'C' && a[1][i] != 'T' && a[1][i] != 'G'))
				{
					r = 0;
					break;
				}
				else if (a[0][i] == a[1][i])
				{
					s++;
				}
			}
		}
		if (r == 0)
		{
			System.out.print("error");
		}
		else if (1.0 * s / l >= n)
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

