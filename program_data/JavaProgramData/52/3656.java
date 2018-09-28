package <missing>;

public class GlobalMembers
{
	/**********************
	*????
	*?????
	***********************/
	public static int Main()
	{
		int n; //??????? n? ????m?
		int m;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //??n???
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j < m; j++) //????m?
		{
			int t = a[n - 1]; //????????
			for (int k = n - 1; k >= 0; k--) //?????????
			{
				if (k > 0)
				{
					a[k] = (a + k - 1); //?????????
				}
				else
				{
					if (k == 0)
					{
						a[0] = t; //????????????
						t = a[n - 1];
					}
				}
			}
		}
		int mark = 0; //?????
		for (int i1 = 0; i1 < n; i1++)
		{
			if (mark == 0) //??????????
			{
				System.out.print((a + i1));
				mark++;
			}
			else //?????????
			{
				System.out.print(" ");
				System.out.print((a + i1));
			}
		}
	return 0;
	}

}

