package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j;
		int k;
		String ps = new String(new char[100]);

		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar);
			}
			i++;
		} while (System.in.read() != '\n');

		k = i;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		ps = s.charAt(0);

		for (i = 0;i < k;i++)
		{
			if (strcmp(*(ps.Substring(i)),a) == 0)
			{
				for (j = 0; * (*(ps.Substring(i)) + j) != '\0';j++)
				{
					*(*(ps.Substring(i)) + j) = '\0';
				}
				*(ps.Substring(i)) = b;
			}
		}

			for (j = 0; * (*(ps.Substring(0)) + j) != '\0';j++)
			{
				System.out.printf("%c",*(*(ps.Substring(0)) + j));
			}

			for (i = 1;i < k;i++)
			{
				System.out.print(" ");

				for (j = 0; * (*(ps.Substring(i)) + j) != '\0';j++)
				{
					System.out.printf("%c",*(*(ps.Substring(i)) + j));
				}
			}





	}

}

