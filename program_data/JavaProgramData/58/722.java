package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		final String a = "";
		a = new Scanner(System.in).nextLine();
		m = Integer.parseInt(a);
		for (i = 0;i <= m - 1;i++)
		{
			final String a = "";
			int answer = 1;
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) >= 65 && a.charAt(0) <= 90 || a.charAt(0) >= 97 && a.charAt(0) <= 122 || a.charAt(0) == '_')
			{
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					if (!(a.charAt(j) >= 65 && a.charAt(j) <= 90 || a.charAt(j) >= 97 && a.charAt(j) <= 122 || a.charAt(j) == '_' || a.charAt(j) >= 48 && a.charAt(j) <= 57))
					{
						answer = 0;
						break;
					}
				}
			}
			else
			{
				answer = 0;
			}
			System.out.printf("%d\n",answer);
		}
		return 0;
	}
}
