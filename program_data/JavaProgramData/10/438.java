package <missing>;

public class GlobalMembers
{
	public static int[] daodan = new int[30];
	public static int[] res = new int[30];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			daodan[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			res[i] = 1;
		}
		for (int i = n - 1;i >= 0;i--)
		{
			for (int j = n - 1;j > i;j--)
			{
				 if (daodan[i] >= daodan[j])
				 {
					 res[i] = Math.max(res[i],res[j] + 1);
				 }
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (res[i] > res[0])
			{
			res[0] = res[i];
			}

		}
		System.out.print(res[0]);
		System.out.print("\n");
		return 0;
	}

}

