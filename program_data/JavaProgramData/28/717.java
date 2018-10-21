package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		int n;
		int i;
		int len;
		int temp = -1;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
			str = tangible.StringFunctions.changeCharacter(str, i + 1, str.charAt(i));
		}
		str = tangible.StringFunctions.changeCharacter(str, 0, ' ');
		for (i = 0;i <= n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				len = i - temp - 1;
				temp = i;
				if (len != 0)
				{
					System.out.printf("%d,",len);
				}
			}
		}
		System.out.printf("%d",(n - temp));
	}
}

