package <missing>;

public class GlobalMembers
{
	public static void huiwen(int k, String a, int[] b)
	{
		int i;
		int j = 0;
		for (i = 0; i < (int)a.length() + 1 - k; i++)
		{
			if ((a[i].equals(a[i + k - 1])) && (b[i + 1] == 0))
			{
				for (j = i; j <= i + k - 1; j++)
				{
					System.out.print(a[j]);
				}
				b[i] = 0;
				System.out.print("\n");
			}
			else
			{
				b[i] = 1;
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[501]);
		int[] b = new int[500];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j = 0;
		int k = 0;
		for (k = 2; k <= (int)a.length(); k += 2)
		{
			huiwen(k, a, b);
		}
		return 0;
	}
}

