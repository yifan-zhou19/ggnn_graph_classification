package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[102]);
		String w = new String(new char[50]);
		int i;
		int j;
		int[] k = new int[102];
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != ' ';i++)
		{
			w = tangible.StringFunctions.changeCharacter(w, i, s.charAt(i));
		}
		w = tangible.StringFunctions.changeCharacter(w, i, '\0');
		for (i = w.length() + 1;i < s.length();i++)
		{
			for (j = 0;j < w.length();j++)
			{
				if (s.charAt(i + j) != w.charAt(j))
				{
				  k[i] = 1;
				}
			}
		}
		for (i = w.length() + 1;i < s.length();i++)
		{
			if (k[i] == 0)
			{
				System.out.printf("%d",i - w.length() - 1);
				break;
			}
		}
	}

}

