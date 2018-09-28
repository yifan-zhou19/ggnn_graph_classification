package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] words = new char[100][100];
		int i;
		int n;
		int k;
		int j = 0;
		int g = 0;
		s = new Scanner(System.in).nextLine();
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
		int[] L = new int[100];
		int max = String.valueOf(words[0]).length();
		for (i = 1;i < n;i++)
		{
			L[i] = String.valueOf(words[i]).length();
			if (L[i] > max)
			{
				max = L[i];
				j = i;
			}
		}
		int[] M = new int[100];
		int min = String.valueOf(words[0]).length();
		for (i = 1;i < n;i++)
		{
			M[i] = String.valueOf(words[i]).length();
			if (M[i] < min)
			{
				min = M[i];
				g = i;
			}
		}
		System.out.printf("%s\n%s",words[j],words[g]);
		return 0;
	}











}

