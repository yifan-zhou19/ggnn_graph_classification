package <missing>;

public class GlobalMembers
{
	public static final int M = 50;

	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		String s3 = new String(new char[4]);
		final String _s = "ing";
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			j = s.length();
			t = 0;
			s3 = tangible.StringFunctions.changeCharacter(s3, 0, s.charAt(j - 3));
			s3 = tangible.StringFunctions.changeCharacter(s3, 1, s.charAt(j - 2));
			s3 = tangible.StringFunctions.changeCharacter(s3, 2, s.charAt(j - 1));
			s3 = tangible.StringFunctions.changeCharacter(s3, 3, '\0');

			if (!strcmp(_s,s3))
			{
				for (i = 0;i < j - 3;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
				System.out.print("\n");
			}
			else
			{
				for (i = 0;i < j - 2;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
				System.out.print("\n");
			}
		}
	}

}

