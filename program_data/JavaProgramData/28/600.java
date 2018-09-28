package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		String p;
		a = new Scanner(System.in).nextLine();
		p = a;
		int i;
		int j = 0;
		int n;
		int k = 0;
		n = a.length();
		a = tangible.StringFunctions.changeCharacter(a, n, ' ');
		a = tangible.StringFunctions.changeCharacter(a, n + 1, '\0');
		while (*(p.Substring(j)) != ' ')
		{
			k++;
			j++;
		}
		System.out.printf("%d",k);
		k = 0;
		while (*(p.Substring(j)) == ' ')
		{
			j++;
		}
		for (i = j;i < n + 1;i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				k++;
			}
			if (*(p.Substring(i)) == ' ')
			{
				if (*(p.Substring(i) - 1) != ' ')
				{
				   System.out.printf(",%d",k);
					k = 0;
				}
				if (*(p.Substring(i) - 1) == ' ')
				{
					k = 0;
				}
			}
		}
		return 0;
	}

}

