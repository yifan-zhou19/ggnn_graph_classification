package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20000]);
		char[][] words = new char[200][401];
		int s1 = 0;
		int s2 = 0;
		s = new Scanner(System.in).nextLine();
		int n = 0;
		int k = 0;
		for (int i = 0;s.charAt(i) != 0;i++)
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
		int max = String.valueOf(words[0]).length();
		int min = String.valueOf(words[0]).length();
		for (int j = 1;j < n;j++)
		{
			int a = String.valueOf(words[j]).length();
			if (a > max)
			{
				max = a;
				s1 = j;
			}
			if (a < min)
			{
				min = a;
				s2 = j;
			}
		}
		System.out.println(words[s1]);
		System.out.println(words[s2]);
		return 0;
	}






}

