package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int n = 0;
		int j;
		int m = 0;
		int u;
		a = tangible.StringFunctions.changeCharacter(a, 0, new Scanner(System.in).nextLine());
		n = String.valueOf(a.charAt(0)).length();
		for (i = 0,j = 1;i < n;i++)
		{
			if (a.charAt(0)[i] == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, i + 1);
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, String.valueOf(a.charAt(0)).length() + 1);
		for (u = 1;u <= j;u++)
		{
			a = tangible.StringFunctions.changeCharacter(a, u, String.valueOf(a.charAt(0)).substring(b.charAt(u - 1), b.charAt(u) - 1));
			//printf("%d %d %d\n",u,b[u-1],b[u]);
		}
		for (i = j;i >= 2;i--)
		{
			System.out.printf("%s ",a.charAt(i));
		}
		System.out.printf("%s",a.charAt(1));
		return 0;
	}






}

