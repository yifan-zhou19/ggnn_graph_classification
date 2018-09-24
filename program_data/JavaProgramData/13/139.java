package <missing>;

public class GlobalMembers
{
	/*????????*/
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int temp;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[temp] == 0) //?????????????????????????
			{
				num++;
				a[temp] = num;
			}
		}
		for (int j = 1; j <= num; j++) //???j??????
		{
			for (int k = 10; k <= 100; k++) //?10~100???
			{
				if (a[k] == j)
				{
					System.out.print(k);
				}
			}
			if (j < num)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

