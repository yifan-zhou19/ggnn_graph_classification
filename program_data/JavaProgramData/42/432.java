package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int n;
		int i;
		int num;
		int j;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == num)
			{
				for (j = i;j <= n - 2;j++)
				{
					a[j] = a[j + 1]; //??????????????????????????
				}
				i = i - 1; //?i-1,??????
				n = n - 1; //?n????????
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			 if (flag == 0)
			 {
			  System.out.print(a[i]);
			  flag = 1;
			  continue; //????????flag??????????????
			 }

			 System.out.print(" ");
			 System.out.print(a[i]);
		}
		return 0;
	}

}

