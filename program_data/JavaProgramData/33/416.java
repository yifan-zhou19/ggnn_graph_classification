package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int k;
		 int l;
		 String ml = new String(new char[256]);
		 String zl = new String(new char[256]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n + 1;i++)
		 {
			ml = new Scanner(System.in).nextLine();
			l = ml.length();
			for (k = 0;k < l;k++)
			{
				if (ml.charAt(k) == 'A')
				{
					zl = tangible.StringFunctions.changeCharacter(zl, k, 'T');
				}
				else if (ml.charAt(k) == 'G')
				{
					zl = tangible.StringFunctions.changeCharacter(zl, k, 'C');
				}
				else if (ml.charAt(k) == 'C')
				{
					zl = tangible.StringFunctions.changeCharacter(zl, k, 'G');
				}
				else if (ml.charAt(k) == 'T')
				{
					zl = tangible.StringFunctions.changeCharacter(zl, k, 'A');
				}
			}
			for (k = 0;k < l;k++)
			{
				if (k < l - 1)
				{
					System.out.printf("%c",zl.charAt(k));
				}
				else
				{
					System.out.printf("%c\n",zl.charAt(k));
				}
			}
		 }

		return 0;
	}
}

