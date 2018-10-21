package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i = 0;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		while (str.charAt(i) != 0)
		{
			if (str.charAt(i) == ' ')
			{
				if (flag == 0)
				{
					flag = 1;
					System.out.print(str.charAt(i));
				}
				else
				{
					;
				}
			}
			else
			{
				flag = 0;
				System.out.print(str.charAt(i));
			}
			i++;
		}
		return 0;

	}
}
