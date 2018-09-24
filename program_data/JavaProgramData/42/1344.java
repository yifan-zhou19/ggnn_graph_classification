package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int l = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[100001];
		int[] Num = new int[100001];

		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int j = 0; j < n; j++)
		{
			if (num[j] != k)
			{
				Num[l] = num[j];
				l++;
			}
			else
			{
				count++;
			}
		}

		for (int p = 0; p < n - count; p++)
		{
			if (p == 0)
			{
				System.out.print(Num[p]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(Num[p]);
			}
		}
		return 0;
	}

}

