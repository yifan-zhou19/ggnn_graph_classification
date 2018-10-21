package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
		   int[] num = new int[51];
		   num[0] = 01;
		   for (i = 1; i <= n; i++)
		   {
				for (j = 0; j < 50; j++)
				{
					 num[j] = 2 * num[j];
				}
				for (j = 0; j < 50; j++)
				{
					if (num[j] >= 10)
					{
						num[j + 1] += 1;
						num[j] -= 10;
					}
				}
		   }
		   i = 50;
		   while (num[i] == 0)
		   {
				  i--;
		   }
		   for (; i >= 0; i--)
		   {
			   System.out.print(num[i]);
		   }
		}
		return 0;
	}

}

