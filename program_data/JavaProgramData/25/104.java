package <missing>;

public class GlobalMembers
{
	//************************************************
	//*????????N??                         *
	//*?  ?????                                *
	//*?  ??1000012806                            *
	//*?????2010.12.17                          *
	//************************************************
	public static int Main()
	{
		int N; //i,j,??????flag???
		int i;
		int j;
		int flag = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100]; //???????
		a[99] = 1; //????????
		for (j = 1; j <= N; j++)
		{
			for (i = 99; i >= 0; i--) //?????????
			{

				if (a[i] * 2 >= 10) //????????flag???
				{
					a[i] = a[i] * 2 + flag - 10;
					flag = 1;
				}
				else //????flag???
				{
					a[i] = a[i] * 2 + flag;
					flag = 0;
				}
			}
		}
		for (i = 0; i <= 99; i++)
		{
			if (a[i] != 0) //???????????
			{
				j = i;
				break;
			}
		}
		for (i = j; i <= 99; i++) //??????????????
		{
			System.out.print(a[i]);
		}
		return 0;
	}


}

