package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = a.length();
		String b = new String(new char[n]);
		int i;
		int j;
		int k = 0;
		int p;
		int q;
		int s = 0;

		for (i = 2;i < n;i++)
		{
			for (k = 0;k < n - i + 1;k++)
			{
				s = 0;
				for (j = 0;j < i;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(k + j));
				}

				for (p = 0,q = i - 1;p < q;p++,q--)
				{
					if (b.charAt(p) == b.charAt(q))
					{
						s++;
					}
				}

				if (s == i / 2)
				{
					for (int x = 0;x < i;x++)
					{
						if (x == i - 1)
						{
							System.out.print(b.charAt(x));
							System.out.print("\n");
						}
						else
						{
							System.out.print(b.charAt(x));
						}
					}
				}
			}
		}
		return 0;
	}
}

