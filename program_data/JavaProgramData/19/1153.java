package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String h = "";
		final String d = "";
		String w = new String(new char[10]);
		int i;
		int j = 0;
		int k = 0;
		int t = 0;
		s = new Scanner(System.in).nextLine();
		w = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			h.charAt(k)[j] = s.charAt(i);
			j++;
			if ((s.charAt(i + 1) == ' ') || (s.charAt(i + 1) == '\0'))
			{
				h.charAt(k)[j] = '\0';
				k++;
				j = 0;
				i++;
			}
		}
		for (i = 0;i < k;i++)
		{
			t = 0;
			for (j = 0;h.charAt(i)[j] != '\0';j++)
			{
				if (strcmp(h.charAt(i),w) == 0)
				{
					if (h.charAt(i)[j] == w.charAt(j))
					{
						t = 1;
					}
				}
			}
			if (t == 1)
			{
				h = tangible.StringFunctions.changeCharacter(h, i, d);
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;h.charAt(i)[j] != '\0';j++)
			{
				System.out.printf("%c",h.charAt(i)[j]);
			}
			System.out.print(" ");
		}
		for (j = 0;h.charAt(k - 1)[j] != '\0';j++)
		{
				System.out.printf("%c",h.charAt(k - 1)[j]);
		}
	}

}

