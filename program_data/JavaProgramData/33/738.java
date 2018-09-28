package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n;i++)
	{
		 String s = new String(new char[500]);
		 String t = new String(new char[500]);
		 int j = 0;
		 int l;
		 int n;
		 s = new Scanner(System.in).nextLine();
		 for (j = 0,l = 0;s.charAt(j) != '\0';j++)
		 {
				if (s.charAt(j) == 'A')
				{
				   t = tangible.StringFunctions.changeCharacter(t, j, 'T');
				}
				else if (s.charAt(j) == 'T')
				{
				   t = tangible.StringFunctions.changeCharacter(t, j, 'A');
				}
				else if (s.charAt(j) == 'C')
				{
				   t = tangible.StringFunctions.changeCharacter(t, j, 'G');
				}
				else if (s.charAt(j) == 'G')
				{
				   t = tangible.StringFunctions.changeCharacter(t, j, 'C');
				}
				l++;
		 }
		 for (n = 0;n < l - 1;n++)
		 {
			 System.out.printf("%c",t.charAt(n));
		 }
		System.out.printf("%c\n",t.charAt(l - 1));
	}
	return 0;

	}
}

