package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int q;
		int m;
		a = new Scanner(System.in).nextLine();

		for (i = 0;;i++)
		{
			if (a.charAt(i) == 0)
			{
			 q = i;
			 break;
			}
		}

		String b = new String(new char[500]);
		String c = new String(new char[500]);
		for (i = 0;i < 500;i++)
		{
			b = b.substring(0, i);
		 c = c.substring(0, i);
		}

		for (i = 2;i <= q;i++) //??????
		{
			for (j = 0;j <= q - i;j++) //?j??
			{
				for (m = 0;m < i;m++)
				{
				b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(j + i - m - 1));
				}

				for (m = 0;m < i;m++)
				{
				c = tangible.StringFunctions.changeCharacter(c, m, a.charAt(j + m));
				}

				if (strcmp(b,c) == 0)
				{
					System.out.println(c);

				}


			}
		}

	}
}

