package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????2?N??  **
	//*????? 1300012845 **
	//*???2013.11.15  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int p;
		int j;
		int k;
		int flag = 0;
		int[] num = new int[51];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[1] = 1;
		flag = 0;
		if (n == 1) //n==1?????
		{
			System.out.print("2");
			return 0;
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= 40; j++)
			{
				num [j] = num[j] * 2; //????*2
			}
			for (k = 2; k <= 50; k++)
			{
				num[k] += num[k - 1] / 10; //??
				num[k - 1] = num[k - 1] % 10; //???????10
			}
		}
		for (j = 50; j >= 1; j--)
		{
			if (num[j] != 0) //???0???2?n??????0
			{
				flag = 1;
			}
			if (flag == 1)
			{
				System.out.print(num[j]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

