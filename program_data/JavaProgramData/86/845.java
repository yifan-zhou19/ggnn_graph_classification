package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????n, m, num[100], i, j, time
		int m;
		int[] num = new int[100];
		int i;
		int j;
		int time;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) //??????????????????
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0; j < m; j++) //?????????????
			{
				time = num[j] + j * 3;
				if ((time >= 57) && (time <= 60)) //????????????
				{
					System.out.print(num[j]);
					System.out.print("\n");
					break;
				}
				if (time > 60) //??????????????
				{
					num[j] = num[j] - (time - 60);
					System.out.print(num[j]);
					System.out.print("\n");
					break;
				}
			}
			if (j == m) //?????????????????
			{
				num[j] = 60 - j * 3;
				System.out.print(num[j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

