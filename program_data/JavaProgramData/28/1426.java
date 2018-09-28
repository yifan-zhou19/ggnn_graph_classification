package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[5000]);
		char[][] s = new char[300][30];
		int i;
		int a = 0;
		int b = 0;
		int sum = 1;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				s[a][b] = '\0';
				a++;
				b = 0;
				sum++;
			}
			else
			{
				s[a][b] = str.charAt(i);
				b++;
			}
		}
		s[a][b] = '\0';
		for (i = 0;i < sum - 1;i++)
		{
			if (String.valueOf(s[i]).length() != 0)
			{
				System.out.printf("%d,", String.valueOf(s[i]).length());
			}
		}
		System.out.printf("%d", String.valueOf(s[sum - 1]).length());
		return 0;
	}
}
