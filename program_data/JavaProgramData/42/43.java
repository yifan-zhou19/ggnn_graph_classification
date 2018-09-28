package <missing>;

public class GlobalMembers
{
	//???????????//
	//??????//
	//???2010.10.27//

	public static int Main()
	{
		int n = 0;
		int[] a = new int[100002]; //????a[100002]//
		int k = 0;
		int i = 0;
		int j = 0;
		int count = 0; //?????count??????????//
		int f = 0; //??f?????????//

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			if (a[i] == k)
			{
				for (j = i; j <= n; j++) //??????????//
				{
					a[j] = a[j + 1];
				}
				count++; //????1//
				i--; //????a[i]//
			}
		}

		for (i = 1; i <= n - count; i++)
		{
			if (f != 0)
			{
				System.out.print(" ");
			}
			else
			{
				f = 1;
			}
			System.out.print(a[i]);
		}

		return 0;
	}


}

