package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		String list = new String(new char[5]);
		String list1 = new String(new char[5]);

		list = new Scanner(System.in).nextLine();
		for (k = 0;k < 5;k++)
		{
			if (list.charAt(k) == '\0')
			{
				break;
			}
		}

		for (i = 0;i < k;i++)
		{
			list1 = tangible.StringFunctions.changeCharacter(list1, i, list.charAt(k - i - 1));
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",list1.charAt(i));
		}




		return 0;
	}


}

