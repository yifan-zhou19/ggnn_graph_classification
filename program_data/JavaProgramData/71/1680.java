package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] year = new int[201];
		int[][] month = new int[201][2];
		int[] b = new int[13];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month[i][0] > month[i][1])
			{
				j = month[i][0];
				month[i][0] = month[i][1];
				month[i][1] = j; //?????????
			}
		}
		b[1] = b[3] = b[5] = b[7] = b[8] = b[10] = b[12] = 31;
		b[4] = b[6] = b[9] = b[11] = 30; //??????
		for (i = 0;i < n;i++)
		{
			b[2] = 28;
			if ((year[i] % 400 == 0) || ((year[i] % 100 != 0) && (year[i] % 4 == 0)))
			{
				b[2] += 1; //????????
			}
			for (j = month[i][0];j < month[i][1];j++)
			{
				k += b[j]; //????????????
			}
			if (k % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			k = 0;
		}
		return 0;
	}
}

