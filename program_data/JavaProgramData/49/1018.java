package <missing>;

public class GlobalMembers
{
	//**********?????????*****************
	//**********???????*********************
	//**********?????2012?11?9?************
	//**********???1200062701******************


	public static int Main()
	{
		int totallength = 0; //??????????
		int flag = 0;
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int b = 0; b < 500; b++)
		{
			if (a.charAt(b) == 0)
			{
				break; //???????
			}
			else
			{
				totallength++;
			}
		} //????????
		for (int length = 2; length <= 500; length++)
		{
			for (int j = 0; j <= totallength - length + 1; j++)
			{ //????????????
				for (int k = 0; k < length / 2; k++)
				{
					if (a.charAt(j + k) == a.charAt(j + length - 1 - k))
					{
						flag++; //???????
					}
				}
				if (flag == length / 2) //?????????
				{
					for (int l = j; l <= j + length - 1; l++)
					{
						System.out.print(a.charAt(l));
						flag = 0; //???????
					}
					System.out.print("\n");
				} //??????
				else
				{
					flag = 0; //?????????
				}
			}
		}
		return 0;
	}

}

