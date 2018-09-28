package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int num;
		int j = 1;
		int m;
		int n;
		int k = 1;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		num = a.length();
		for (i = 0;i < 100;i++)
		{
			for (j = 1;j < num;j++)
			{
				if (a.charAt(j - 1) != ' ' && a.charAt(j) == ' ' && a.charAt(j + 1) == ' ')
				{
					m = j;
				}
				if (a.charAt(j - 1) == ' ' && a.charAt(j) == ' ' && a.charAt(j + 1) != ' ')
				{
					n = j;
					break;
				}
				if (a.charAt(j - 1) != ' ' && a.charAt(j) == ' ' && a.charAt(j + 1) != ' ')
				{
					n = num;
				}
			}
			for (k = 1;k <= (num - n);k++)
			{
					a = tangible.StringFunctions.changeCharacter(a, m + k, a.charAt(n + k));
					if (k == num - n)
					{
					a = tangible.StringFunctions.changeCharacter(a, m + k, '\0');
					}
			}
		}
		System.out.println(a);
	return 0;
	}

}

