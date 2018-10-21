package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.???? **
	//*?????? 1300017623 **
	//*???2013.12.11  **
	//********************************
	public static int Main()
	{
		char[][] a = new char[1000][43];
		String p = a;
		int n;
		int l;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		do
		{
			System.out.print(p);
			l = String.valueOfp.length();
			p = p.Substring(1);
			while ((l += String.valueOfp.length() + 1) <= 80)
			{
				System.out.print(" ");
				System.out.print(p);
				p = p.Substring(1);
				if (p > a[n - 1])
				{
					break;
				}
			}
			System.out.print("\n");
		}while (p <= a[n - 1]);

		return 0;
	}
}

