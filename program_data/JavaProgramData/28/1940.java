package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int i;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				num++;
				if (i == a.length() - 1)
				{
					System.out.printf("%d",num);
				}
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				System.out.printf("%d,",num);
				num = 0;
			}
		}
	   return 0;
	}

}
