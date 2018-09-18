package <missing>;

public class GlobalMembers
{
	/*
	 * ??????.cpp
	 *  ????: 2010-11-14
	 *     ??????
	 */


	public static int Main()
	{
		for (int i = 0;;i++)
		{ //????
			int[] a = new int[16];
			int temp;
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (temp == -1)
			{
			break; //??-1???
			}
			else
			{
				a[0] = temp;
			}
			int n = 1;
			for (int j = 1;;j++)
			{
				int temp1;
				temp1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (temp1 == 0) //??0???????
				{
					break;
				}
				else
				{
					a[j] = temp1;
				n++;
				}
			}
			int m = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{

					if ((a[i] == (2 * a[j])))
					{
						m++; //??2????
					}

				}
			}
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}


}

