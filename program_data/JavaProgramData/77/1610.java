package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int len;
		int r;
		final String s = "";
		char a;
		char b;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			a = s.charAt(0);
			if (s.charAt(i) != a)
			{
				b = s.charAt(i);
				break;
			}
		}
	 for (r = 0;r < len / 2 + 1;r++)
	 {
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == a)
			{
				for (j = i + 1,k = 0;j < len;j++)
				{
					if (s.charAt(j) == ' ')
					{
						continue;
					}
				 else if (s.charAt(j) == b)
				 {
					 s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					 s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					 System.out.printf("%d %d\n",i,j);
					 k++;
					 break;
				 }
				 else
				 {
					 break;
				 }
				}
					if (k == 1)
					{
						break;
					}
			}


		}
	 }


	}
}

