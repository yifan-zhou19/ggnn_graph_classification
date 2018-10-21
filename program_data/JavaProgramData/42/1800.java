package <missing>;

public class GlobalMembers
{
	//***********************************************************
	//*    name: 2.cpp                                          *
	//*    author:??                                          *
	//*    date: 2013-10-30                                     *
	//*    description?????????                        *
	//***********************************************************
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000000];
		for (i = 0; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < (n - count) ; i++)
		{
			if (a[i] == k)
			{
				for (j = i ;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				i--;
				count++;
			}

		}
		i = 0;
		while (i < n - count - 1)
		{
			System.out.print(a[i]);
			System.out.print(' ');
			i++;
		}
		System.out.print(a[n - count - 1]);
		return 0;
	}



}

