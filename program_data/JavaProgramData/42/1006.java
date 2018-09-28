package <missing>;

public class GlobalMembers
{
	//**********************************
	//*  ????????              *
	//*  ??????                  *
	//*  ?????2011?10?23?      *
	//**********************************
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int x;
		int k;
		int sum;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0; //sum??????????,??????0
		for (i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = x;
		} //????????????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n - sum;i++)
		{
			if (a[i] == k) //???????????????
			{
				for (j = i + 1;j <= n - sum;j++)
				{
					a[j - 1] = a[j]; //????????????
				}
				sum = sum + 1; //?????????1
				i--; //?????1,????????????
			}
		}
		for (i = 1;i <= n - sum;i++)
		{
			if (i < n - sum)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

