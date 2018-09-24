package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i = 0;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
	//	cout<<str;

		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
				i++;
				continue;
			}
			if (str.charAt(i) == ' ' && flag == 0)
			{
				if (str.charAt(i + 1) == ' ')
				{
					flag = 1;
				}
				System.out.print(str.charAt(i));
			}
			else
			{
				if (str.charAt(i) == ' ' && flag == 1)
				{
					if (str.charAt(i + 1) != ' ')
					{
						flag = 0;
					}
				}
			}
			i++;
		}
		System.out.print("\n");
		return 0;
	}
}
