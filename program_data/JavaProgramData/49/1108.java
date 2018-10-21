package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int j;
		int k;
		int n;
		int q;
		int p;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j < n - i + 1;j++)
			{
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j + k));
				}
				for (q = 0,s = 0;q <= (i - 2) / 2;q++)
				{
					if (b.charAt(q) != b.charAt(i - 1 - q))
					{
						s = 1;
					}
				}
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
				if (s == 0)
				{
					System.out.printf("%s\n",b);
				}

			}
		}
		return 0;
	}
}

