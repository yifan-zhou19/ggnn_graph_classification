package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 0;
		int i;
		char[][] a = new char[100][100];
		String e = new String(new char[210]);
		double n;
		e = new Scanner(System.in).nextLine();
		n = Double.parseDouble(e);
		a[0] = new Scanner(System.in).nextLine();
		a[1] = new Scanner(System.in).nextLine();
		int p = String.valueOf(a[0]).length();
		int q = String.valueOf(a[1]).length();
		if (p != q)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < p;i++)
			{
				if (!(a[0][i] == 'A' || a[0][i] == 'T' || a[0][i] == 'G' || a[0][i] == 'C' && a[1][i] == 'A' || a[1][i] == 'T' || a[1][i] == 'G' || a[1][i] == 'C'))
				{
					System.out.print("error");
					return 0;
				}
				else
				{
					if (a[0][i] == a[1][i])
					{
						b++;
					}
				}
			}
		}
		if (1.0 * b / p > n)
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
