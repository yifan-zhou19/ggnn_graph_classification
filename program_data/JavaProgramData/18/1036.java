package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int range;
		range = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = range;
		int[][] a = new int[102][102];
		(int)(*p)[102] = a;
		int i;
		int j;
		int k;
		int q;
		int sum = 0;
		for (i = 0; i < range; i++)
		{
			sum = 0;
			n = range;
			int minrow = 999999;
			int mincol = 999999;
			for (j = 0; j < n; j++) // cin juzhen
			{
				for (k = 0; k < n; k++)
				{
					*(*(p + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (; n > 1;)
			{

			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					if (*(*(p + j) + k) < minrow)
					{
						minrow = (*(p + j) + k);
					}
				}
				for (k = 0; k < n; k++)
				{
					*(*(p + j) + k) = *(*(p + j) + k) - minrow;
				}
				minrow = 999999;
			} //end of finding row min
			/*for (j = 0; j < n; j++) 
				for (k = 0; k < n; k++)
					cout <<  *(*(p + j) + k) << " ";
				cout << endl;*/
			for (k = 0; k < n; k++)
			{
				for (j = 0; j < n; j++)
				{
					if (*(*(p + j) + k) < mincol)
					{
						mincol = (*(p + j) + k);
					}
				}
				for (j = 0; j < n; j++)
				{
					*(*(p + j) + k) = *(*(p + j) + k) - mincol;
				}
				mincol = 999999;
			} //end of finding col min
			/*for (j = 0; j < n; j++) 
				for (k = 0; k < n; k++)
					cout <<  *(*(p + j) + k) << " ";
				cout << endl;*/
			sum += *(*(p + 1) + 1);
			//cout << sum << endl;
			if (n == 2)
			{
				break;
			}
			for (j = 1; j <= n - 2; j++)
			{
				for (k = 0; k < n; k++)
				{
					*(*(p + j) + k) = *(*(p + j + 1) + k);
				}
			}
			for (j = 1; j <= n - 2; j++)
			{
				for (k = 0; k < n; k++)
				{
					*(*(p + k) + j) = *(*(p + k) + j + 1);
				}
			}
			n--;
			/*for (j = 0; j < n; j++) 
				for (k = 0; k < n; k++)
					cout <<  *(*(p + j) + k) << " ";
				cout << endl;*/
			//for (j = 0; j < n; j++) 
			//	for (k = 0; k < n; k++)
			//		cout <<  *(*(p + j) + k) << endl;
			} // end of n--
			//sum += *(*(p + 1) + 1);
			System.out.print(sum);
			System.out.print("\n");

		} // end for n ci
		return 0;
	}
}

