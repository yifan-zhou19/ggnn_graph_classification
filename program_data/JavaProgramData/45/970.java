package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	 String a = new String(new char[101]);
		char[][] word = new char[20][3];
		int i;
		int n;
		int k;
		int e1;
		int e2;


		a = new Scanner(System.in).nextLine();

		n = 0;
		k = 0;
		for (i = 0;a.charAt(i) != 0;i++)
		{

			if (a.charAt(i) == ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			   word[n] = (a.Substring(k));

				k = i + 1;
				n++;
			}
		}
			 word[n] = (a.Substring(k));
			 n++;



		   e1 = String.valueOf(word[0]).length();
		   e2 = String.valueOf(word[1]).length();



			 for (i = 0;i < e2;i++)
			 {
				 if (word[1][i] == word[0][0])
				 {
							 System.out.printf("%d\n",i);
							 break;

				 }
			 }
				 return 0;
	}
}

