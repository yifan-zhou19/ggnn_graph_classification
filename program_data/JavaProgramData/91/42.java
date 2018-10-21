package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		final String a = "";
		final String b = "";
		String p;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		j = 0;
		p = a;
		for (i = 0;i < n;i++)
		{
			k = i + 1;
			if (k >= n)
			{
				k = k - n;
			}
			b = tangible.StringFunctions.changeCharacter(b, j, *(p.Substring(i)) + *(p.Substring(k)));
			j++;
		}
		System.out.println(b);
		return 0;
	}


}

