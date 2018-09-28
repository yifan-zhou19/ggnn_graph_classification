package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 1;
		int j;
		int m;
		int n;
		int p;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 1;i <= 100;i++)
		{
			if (a.charAt(i - 1) != '\0')
			{
				s = s + 1;
			}
			else
			{
				break;
			}
		}
		m = a.charAt(0);
		a = tangible.StringFunctions.changeCharacter(a, s, m);
		for (j = 1;j <= s;j++)
		{
			n = a.charAt(j - 1);
			p = a.charAt(j);
			System.out.printf("%c",n + p);
		}
		return 0;
	}






}

