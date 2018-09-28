package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = a.length() - 1,k = b.length() - 1;k >= 0;j--,k--)
			{
				if (a.charAt(j) >= b.charAt(k))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(k) + '0');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(k) + '0');
					a.charAt(j - 1)--;
				}
			}
			for (j = 0;j <= a.length() - 1;j++)
			{
				if (a.charAt(j) != '0')
				{
					for (k = j;k <= a.length() - 1;k++)
					{
					System.out.print(a.charAt(k));
					}
					break;
				}
			}
			if (j == a.length() && a.charAt(j - 1) == '0')
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

