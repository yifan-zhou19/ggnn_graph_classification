package <missing>;

public class GlobalMembers
{
	//*************************************
	//*   ????                        *
	//*   ??????                    *
	//*   ?????2011?12?18?        *
	//*************************************


	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int p;
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length(); //????????
		for (i = 2; i <= n; i++) //i??????????????
		{
			for (p = 0; p <= n - i; p++) //p???????????
			{
				flag = 1; //flag???????????
				for (j = p; j < p + i; j++) //j?????????
				{
					if (a.charAt(j) != a.charAt(2 * p + i - 1 - j))
					{
						flag = 0;
						break; //????????,flag??0,??????
					}
				}
				if (flag == 1)
				{
					for (j = p; j < p + i; j++)
					{
						System.out.print(a.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

