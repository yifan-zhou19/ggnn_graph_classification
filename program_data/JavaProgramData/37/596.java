package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int p;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		String b = new String(new char[10]);
		final String d = "A";


		for (i = 0;i < t;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, d.charAt(0));
		}

		int[] count = new int[26];


		for (i = 0;i < t;i++)
		{
			for (j = 0;j < 26;j++)
			{
				count[j] = 0;
			}

			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < 100;j++)
			{
				if (a.charAt(j) != d.charAt(2))
				{
					p = a.charAt(j) - 97;

					count[p] = count[p] + 1;

				}
				else
				{
					break;
				}
			}

			for (j = 0;j < 100;j++)
			{
				p = a.charAt(j) - 97;
				if (count[p] == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, p + 97);
					break;
				}
			}
		}
		for (i = 0;i < t;i++)
		{

			if (b.charAt(i) == d.charAt(0))
			{
				System.out.print("no\n");
			}
			if (b.charAt(i) != d.charAt(0))
			{
				System.out.print(b.charAt(i));
				System.out.print("\n");
			}
		}








		return 0;
	}
}

