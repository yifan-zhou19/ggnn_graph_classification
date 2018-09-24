package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int flag = 1;
		int j = 0;
		str = new Scanner(System.in).nextLine();

		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				flag = 0;
				j++;
			}
			else
			{
				j = 0;
				flag = 1;
			}
			if (!(flag == 0 && j > 1))
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
	}
}
