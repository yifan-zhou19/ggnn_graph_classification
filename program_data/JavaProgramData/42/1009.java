package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????               **
	//*????? 1100012780     	        **
	//*???2011.10.23                     **
	//****************************************
	public static int Main()
	{
		int n; //?????????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000]; //??a[100000]??????k?????i,j,count??????????
		int k;
		int i;
		int j;
		int count = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1;i >= 0;i--)
		{
			if (a[i] == k)
			{
				count++;
				if (i != n - 1)
				{
					for (j = i;j < n - 1;j++)
					{
						a[j] = a[j + 1];
					}
				}
			}
		}
		for (i = 0;i <= n - 1 - count;i++)
		{
			if (i != n - 1 - count)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

