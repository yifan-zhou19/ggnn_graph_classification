package <missing>;

public class GlobalMembers
{
	/*
	 * wangge25.cpp
	 *
	 *  Created on: 2010-11-6
	 *      Author:???
	 */
	public static int Main() //???
	{
		int n; //??????n,i,j,k,t??t ????0
		int i;
		int j;
		int k;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //??????a[i]
		for (i = 0;i < n;i++)
		{ //???????i
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++) //???????i
		{
				if (a[i] >= 0) //??a[i]????0
				{
					for (j = i + 1; j < n; j++) //???????j
					{
						if (a[i] == a[j])
						{
							a[j] = -1; //??a[i]??a[j]??a[j]???-1
						}
					}
				}
		}

			for (i = 0; i < n; i++) //???????i
			{
				if (a[i] >= 0) //??a[i]??0???????
				{
					if (i > 0)
					{
						System.out.print(' ');
					}
					System.out.print(a[i]);
				}
			}

			return 0; //?????
	}

}

