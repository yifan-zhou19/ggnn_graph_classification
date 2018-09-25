package <missing>;

public class GlobalMembers
{
	public static int[] yinshu = new int[10000];
	public static int j = 0;
	public static int temp = 0;
	public static int Main()
	{
		void fenjie(int j,int sum);
		int t;
		int[] n = new int[10000];
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 10000;i++)
		{
			yinshu[i] = 0;
		}
		for (i = 0;i < t;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < t;i++)
		{
			fenjie(1, n[i]);
			System.out.print(temp);
			System.out.print("\n");
			temp = 0;
		}
		return 0;
	}
	public static void fenjie(int j,int sum)
	{
		for (int i = 2;i <= sum;i++)
		{
			if (sum % i == 0 && yinshu[j - 1] <= i)
			{
				yinshu[j] = i;
				if (sum == i)
				{
					temp++;
				}
				else
				{
					fenjie(j + 1, sum / i);
				}
			}
		}
	}

}

