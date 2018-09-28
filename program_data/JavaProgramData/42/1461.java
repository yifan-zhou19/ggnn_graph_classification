package <missing>;

public class GlobalMembers
{
	//*******************************
	//???????
	//??????1200012798
	//??? 2012.11.4
	//******************************* 


	public static int Main()
	{
		int n;
		int k;
		int[] num = new int[100000];
		int count = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= n - 1; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j <= n - 1 - count;)
		{
			if (num[j] == k)
			{
				for (int l = j; l <= n - 2 - count; l++)
				{
					num[l] = num[l + 1];
				}
				count++;
			}
			else
			{
				j++;
			}
		}
		System.out.print(num[0]);
		for (int m = 1; m <= n - 1 - count; m++)
		{
			System.out.print(" ");
			System.out.print(num[m]);
		}

		return 0;
	}
}

