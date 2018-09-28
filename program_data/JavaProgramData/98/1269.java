package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][40];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;)
		{
			System.out.print(a[i]);
			int la = String.valueOf(a[i]).length();
			int lc = la;
			for (j = 1;j + i < n;j++)
			{
				int lb = String.valueOf(a[i + j]).length();
				lc += lb;
				if (lc < 80)
				{
					System.out.print(" ");
					System.out.print(a[i + j]);
					lc++;
				}
				else
				{
					System.out.print("\n");
					break;
				}
			}
			i += j;
		}
		return 0;
	}
}

