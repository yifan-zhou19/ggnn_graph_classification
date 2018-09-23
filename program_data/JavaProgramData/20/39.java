package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		char d;
		int num = 0;
		int j;
		int max;
		int q;
		int len;
		int t;

		while (true)
		{
			if ((d = System.in.read()) == EOF)
			{
				break;
			}
			a = tangible.StringFunctions.changeCharacter(a, 0, d);
			a = tangible.StringFunctions.changeCharacter(a, 1, new Scanner(System.in).nextLine());
			max = 0;
			len = a.length();
			for (j = 0;j < 3;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(len + j - 3));
			}
			for (j = 0;j < len - 4;j++)
			{
				t = a.charAt(j);
				if (t > max)
				{
					max = t;
					q = j;
				}
			}
			c = a;
			for (j = q + 1;j < q + 4;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, b.charAt(j - q - 1));
			}
			for (j = q + 4;j < len - 1;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(j - 3));
			}


			for (j = 0;j < len - 1;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			System.out.print("\n");
		}

	}




}

