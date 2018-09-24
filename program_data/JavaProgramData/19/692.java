package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


	   String a = new String(new char[1000]);
		char[][] word = new char[100][100];
		String sub = new String(new char[100]);
		String w = new String(new char[100]);
		int i;
		int n;
		int k;


		a = new Scanner(System.in).nextLine();
		w = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();

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






			 for (i = 0;i < n;i++)
			 {
				 if (strcmp(word[i], w) == 0)
				 {

							word[i] = sub;


				 }
			 }


				 for (i = 0;i < n - 1;i++)
				 {

					 System.out.printf("%s ",word[i]);

				 }
					 System.out.println(word[n - 1]);
	return 0;
	}
}

