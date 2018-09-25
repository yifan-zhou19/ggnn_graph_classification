package <missing>;

public class GlobalMembers
{
	public static int numcount = 0;
	public static void divide(int num,int x)
	{
		int i;
		if (num == 1)
		{
			numcount++;
		}
		for (i = x;i <= num;i++)
		{
			if (num % i == 0)
			{
				divide(num / i, i);
			}
		}
	}

	public static int Main()
	{
		int n;
		int num;
		int i;
		int first = 2;
		int[] ans = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			divide(num, first);
			ans[i] = numcount;
			//cout<<count<<endl;
			numcount = 0;
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(ans[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

