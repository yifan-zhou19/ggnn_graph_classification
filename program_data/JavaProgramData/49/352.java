package <missing>;

public class GlobalMembers
{
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
			for (i = 0; i < (int)a.length() + 1 - k; i++)
			{
				if ((a.charAt(i) == a.charAt(i + k - 1)) && (b[i + 1] == 0))
				{
					for (j = i; j <= i + k - 1; j++)
					{
						System.out.print(a.charAt(j));
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
		return 0;
	}
}

