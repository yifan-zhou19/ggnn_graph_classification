package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ai;
		int bi;
		int sum = 0;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n; j++)
		{
			ai = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			bi = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ai >= 90 & ai <= 140 & bi >= 60 & bi <= 90)
			{
				sum = sum + 1;
			}

			else
			{
				sum = 0;
			}

			num[j] = sum;
		}

		 if (n <= 1)
		 {
			  System.out.print(sum);
			  System.out.print("\n");
		 }
		 else
		 {
			   for (int j = 1; j < n; j++)
			   {
				if (num[j] < num[j - 1])
				{
					num[j] = num[j - 1];
				}
			   }
			  System.out.print(num[n - 1]);
			  System.out.print("\n");
		 }

		return 0;

	}
}

