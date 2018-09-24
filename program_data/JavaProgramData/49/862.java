package <missing>;

public class GlobalMembers
{
	//***********************************
	//??:???    1200012772 *********
	//??:????             *********
	//??:2012?11?16?       *********
	public static int Main()
	{
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int j = 0;
		int flag = 1;
		int k = 0;
		for (j = 2; j <= a.length(); j++)
		{
			for (i = 0;i <= (a.length() - j); i++)
			{
				for (k = i; k < (i + j); k++)
				{
					if (a.charAt(k) != a.charAt(i + i + j - k - 1))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (k = i; k < (i + j); k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
				flag = 1;
			}
		}
			return 0;
	}


}

