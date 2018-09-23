package <missing>;

public class GlobalMembers
{
	//************************************************************************************
	//*    name: 1.cpp                                                                   *
	//*    author:??                                                                   *
	//*    date: 2013-10-30                                                              *
	//*    description???????????????????????????????     *
	//************************************************************************************
	public static int Main()
	{
		int t; //???????????????
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int count;
		while ((t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			count = 0;
			if (t < 0)
			{
				return 0; //??-1?????
			}
			a[0] = t; //????????????????
			for (i = 1;i < 16;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break; //???????0????
				}
			}
			for (j = 0 ;j < i;j++) //???i???????
			{
				for (k = 0;k < i;k++)
				{
					if (a[k] == 2 * a[j])
					{
						count++; //????????????????????1
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
	}






}

