package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int L = 0;
		int k = 0;
		int j = 0;
		int c;
		int t = 0;
		String a = new String(new char[500]);
		while ((c = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, k++, c);
		}
		for (L = 2; L <= k; L++)
		{ //L?????
			t = 0;
			for (i = 0; i < k; i++)
			{
				t = 0;
				for (int p = L; p > 0; p--)
				{ //???????
					if (a.charAt(i + L - p) == a.charAt(i + p - 1))
					{
						t = 1;
					}
					if (a.charAt(i + L - p) != a.charAt(i + p - 1))
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{ //??
					for (j = i; j < i + L; j++)
					{
						System.out.print(a.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

