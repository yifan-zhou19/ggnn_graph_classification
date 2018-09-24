package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		int i;
		int j = 0;
		int flag = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				flag = 0;
				System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i) == ' ')
			{
				if (flag == 0)
				{
					flag = 1;
					System.out.print(" ");
				}
				else
				{
					continue;
				}
			}
		}


		System.out.print("\n");
	}

}
