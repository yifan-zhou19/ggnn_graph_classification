package <missing>;

public class GlobalMembers
{
	//***********************************
	//*???????????????? *
	//*?  ????  1100062709         *
	//*?  ??2011.11.5                *
	//***********************************
	public static int Main()
	{
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			int j;
			int k;
			int flag = 0;
			int repeat = 0;
			String str = new String(new char[100001]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int length = str.length();
			for (j = 0; j < length; j++)
			{
				for (k = 0; k < length; k++)
				{
					if (j == k)
					{
					   continue;
					}
					else if (str.charAt(j) == str.charAt(k))
					{
						 repeat = 1;
						 break;
					}
				}
				if (repeat == 0)
				{
				   System.out.print(str.charAt(j));
				   System.out.print("\n");
				   flag = 1;
				   break;
				}
				repeat = 0;
			}
			if (flag == 0)
			{
			   System.out.print("no");
			   System.out.print("\n");
			}
		}
		return 0;
	}

}

