package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[520]);
		int i;
		int j;
		int k;
		int l;
		int p;
		int n;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				k = j;
				p = i;
				if (a.charAt(p) == a.charAt(p + k) && k == 1)
				{
					System.out.print(a.charAt(p));
					System.out.print(a.charAt(p + 1));
					System.out.print("\n");
				}
				if (a.charAt(p) == a.charAt(p + k) && k > 1)
				{
					while (a.charAt(p) == a.charAt(p + k) && k > 1)
					{
						p++;
						k = k - 2;
					}
					if (k < 2 && a.charAt(p) == a.charAt(p + k))
					{
						for (l = i;l <= i + j;l++)
						{
							System.out.print(a.charAt(l));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

