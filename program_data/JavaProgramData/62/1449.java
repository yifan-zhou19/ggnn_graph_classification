package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		int i;
		int sum = 0;
		int j;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')

			{
				sum++;
				for (j = i;j < str.length();j++)
				{
					*(str.Substring(j)) = *(str.Substring(j) + 1);
				}
				i--;
			}
		}
		for (i = 0;i < str.length();i++)
		{
			System.out.printf("%c",str.charAt(i));
		}

	}
}
