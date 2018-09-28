package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100000];
		int n;
		int i;
		int del;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			num[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int wNo;
		int sNo;
		int count = 0;
		for (wNo = 0; wNo < n - count; wNo++)
		{
			if (del == num[wNo])
			{
				for (sNo = wNo; sNo < n - count; sNo++)
				{
					num[sNo] = num[sNo + 1];
				}
				count += 1;
				wNo = -1;
			}
		}
		int oNo;
		for (oNo = 1; oNo < n - count; oNo++)
		{
			System.out.print(num[oNo - 1]);
			System.out.print(" ");
		}
		System.out.print(num[oNo - 1]);
		System.out.print("\n");
		return 0;
	}
}

