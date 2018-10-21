package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[2050]);
		z = new Scanner(System.in).nextLine();
		int i = 0;
		int n = z.length();
		int record = 0;
		int q = 0;
		z = tangible.StringFunctions.changeCharacter(z, n, ' ');
		for (i = 0;i <= n;i++)
		{
			if (z.charAt(i) == ' ' && z.charAt(i - 1) != ' ')
			{
				if (q == 0)
				{
					System.out.printf("%d",record);
					q = 1;
				}
				else
				{
					System.out.printf(",%d",record);
				}
				record = 0;
			}
			else if (z.charAt(i) != ' ')
			{
				record++;
			}
		}
		return 0;
	}
}

