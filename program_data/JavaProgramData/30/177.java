package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int m;
		int t;
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			t = 0;
			int k = ((int)Math.log(n)) + 1;
			if (i % 7 != 0)
			{
				for (j = 0;j < k;j++)
				{
				 if ((i / (int)Math.pow(10,j)) % 10 == 7)
				 {
					t = 1;
					break;
				 }
				}
				if (t == 0)
				{
				sum += i * i;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}

}

