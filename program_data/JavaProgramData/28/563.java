package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] words = new char[300][20];
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		int n;
		int k;
		int sum;
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

		sum = String.valueOf(words[0]).length();
		if (sum != 0)
		{
		System.out.printf("%d",sum);
		}
		for (i = 1;i < n;i++)
		{
		  int result = 0;
		  result = String.valueOf(words[i]).length();
		  if (result == 0)
		  {
			continue;
		  }
		  if (result != 0)
		  {
		  System.out.printf(",%d",result);
		  }
		}
		return 0;
	}

}

