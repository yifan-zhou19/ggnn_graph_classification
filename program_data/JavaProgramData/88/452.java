package <missing>;

public class GlobalMembers
{
	/*???????4
	  ????00948344 ??
	  ?????2010//12/31
	*/


	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == '0' && str.charAt(i + 1) == '0')
			{
				continue;
			}
			else if ((str.charAt(i) == '0') && ((str.charAt(i + 1) < '0') || (str.charAt(i + 1)>'9')))
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else if (str.charAt(i) > '0' && str.charAt(i) <= '9')
			{
				for (j = i;j < len;j++)
				{
					if (str.charAt(j) < '0' || str.charAt(j)>'9')
					{
						i = j - 1;
						break;
					}
					if (j == len - 1)
					{
						i = j;
					}
					System.out.print(str.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}
