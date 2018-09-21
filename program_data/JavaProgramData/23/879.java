package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		k = str.length();
		for (i = k - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				for (j = i + 1;;j++)
				{
					if (str.charAt(j) != ' ')
					{
						System.out.printf("%c",str.charAt(j));
					}
					if (str.charAt(j) == ' ' || j == k - 1)
					{
						System.out.print(" ");
						break;
					}
				}
			}
		}
		for (i = 0;;i++)
		{
		if (str.charAt(i) != ' ')
		{
			System.out.printf("%c",str.charAt(i));
		}
			if (str.charAt(i) == ' ' || i == k - 1)
			{
				break;
			}
		}
	}

}
