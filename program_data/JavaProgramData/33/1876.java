package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int q;
		String s = new String(new char[255]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			s = new Scanner(System.in).nextLine();
			k = s.length();
			for (i = 0;i < k;i++)
			{
				if (s.charAt(i) == 'A')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 'T');
				}
				else if (s.charAt(i) == 'T')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 'A');
				}
				else if (s.charAt(i) == 'C')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 'G');
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, 'C');
				}
			}
			for (q = 0;q < k - 1;q++)
			{
				System.out.printf("%c",s.charAt(q));
			}
			System.out.printf("%c\n",s.charAt(k - 1));
		}

	}




}

