package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] word = new char[100][101];
		int n;
		int k;
		int i;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		// ?s???????????words?
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				word[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		word[n] = (s.Substring(k));
		n++;


		for (i = 0;i < n;i++)
		{ //??
						 if (strcmp(a,word[i]) == 0)
						 {
												  word[i] = b;
						 }
		}

		 for (i = 0;i < n - 1;i++)
		 { //??
						  System.out.printf("%s ",word[i]);
		 }

		 System.out.printf("%s",word[n - 1]);


	}

}

