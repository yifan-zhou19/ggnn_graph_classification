package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?10?22?                        *
	//*  ????: ??????                          *
	//****************************************************


	public static int Main()
	{
		int[] a = new int[10001]; //??A??????????
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= n;i++)
		{
			a[i] = 1; //???A
		}
		for (i = 2;i <= n / 2;i++)
		{
			if (a[i] != 0)
			{
				j = i + i; //?????????
				while (j < n)
				{ //????
					a[j] = 0;
					j = j + i;
				}
			}
		}
		for (i = 2;i <= n / 2; i++)
		{
			if (a[i] != 0 && a[n - i] != 0)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(n - i);
				System.out.print("\n");
			}
			//????????? 
		}

		return 0;
	}

}

