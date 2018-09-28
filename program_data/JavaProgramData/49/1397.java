package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int d;
		int g;
		int k;
		int l;
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		d = a.length();
		for (i = 2; i <= d; i++)
		{
			for (j = 0; j + i <= d; j++)
			{
				g = 0;
				for (k = j, l = j + i - 1; k < l; k++, l--)
				{
					if (a.charAt(k) != a.charAt(l))
					{
						g = 1;
						break;
					}
				}
				if (g == 0)
				{
					for (k = j; k <= j + i - 1; k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

