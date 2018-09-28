package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[500]);
		char[][] words = new char[50][500];
		int n;
		int k;
		int i;
		int[] len = new int[50];
		int max = 0;
		int min = 100000;
		int da = 0;
		int xiao = 0;
		s = new Scanner(System.in).nextLine();

		 // ?s???????????words?
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;



		for (i = 0;i < n;i++)
		{
						 len[i] = String.valueOf(words[i]).length();
						 if (len[i] > max)
						 {
										da = i;
										max = len[i];
						 }
		}

		for (i = 0;i < n;i++)
		{
						 len[i] = String.valueOf(words[i]).length();
						 if (len[i] < min)
						 {
										xiao = i;
										min = len[i];
						 }
		}

		System.out.printf("%s\n",words[da]);
		System.out.printf("%s\n",words[xiao]);



	}

}

