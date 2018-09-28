package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[5000]);
		int i;
		int num = 0;
		int n;
		char c;
		String = new Scanner(System.in).nextLine();
		n = String.length();
		for (i = 0;i <= n - 1;i++)
		{
			if ((c = string.charAt(i)) != ' ')
			{
			num = num + 1;
			}
			else
			{
				if (num != 0)
				{
					System.out.printf("%d,",num);
				num = 0;
				}
			}

		}
		System.out.printf("%d",num);
	}

}
