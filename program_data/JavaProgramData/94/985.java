package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000]; //????1000?????????????
		int N; //????n,k
		int k;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		for (int i = 1;i <= N;i++) //?for??????
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (k % 2 != 0) //???????????????????????
			{
				a[k] = k;
				num = num + 1; //?????????
			}

		}
		int count = 1;
		for (int i = 1;i < 1000;i++) //??????????????
		{
			if ((a[i] != 0) && (count == num))
			{
				System.out.print(a[i]);

			}

			if ((a[i] != 0) && (count != num))
			{
				System.out.print(a[i]);
				System.out.print(',');
				count = count + 1;
			}



		}
		return 0;
	}



}

