package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[10000]);
		char a;
		char b;
		int n;

		s = new Scanner(System.in).nextLine();
		n = s.length();
		a = s.charAt(0);
		b = s.charAt(n - 1);
		int i;
		for (i = 1;i < n;i++)
		{
			if (s.charAt(i) == b)
			{
				int j;
				int first = 0;
				for (j = i - 1;j >= 0;j--)
				{
					if (s.charAt(j) == a && first == 0)
					{
						System.out.printf("%d %d\n",j,i);
							first = 1;
							s = tangible.StringFunctions.changeCharacter(s, i, ' ');
							s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					}
				}

			}

		}


	}

}

