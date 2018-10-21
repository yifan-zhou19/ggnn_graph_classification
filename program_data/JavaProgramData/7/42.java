package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String w = "";
		final String d = "";
		final String h = "";
		int i;
		int j;
		int k = 0;
		int t = 0;
		int m;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		w = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ((s.charAt(i) == w.charAt(0)) && (n == 0))
			{
				k = 0;
				for (j = 0;w.charAt(j) != '\0';j++)
				{
					t = 0;
					if (w.charAt(j) == s.charAt(i + j))
					{
						k++;
						t = 1;
					}
				}
				if (t == 1)
				{
					for (m = 0;d.charAt(m) != '\0';m++)
					{
						System.out.printf("%c",d.charAt(m));
					}
					i = i + k;
					n = 1;
				}
			}
			if (s.charAt(i) != '\0')
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
	}

}
