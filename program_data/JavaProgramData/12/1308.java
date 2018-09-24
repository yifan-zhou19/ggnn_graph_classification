package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[100];
		int test;
		int count = 0;


		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != -1)
		{
			num[0] = n;
			for (int i = 1; n != 0; i++)
			{
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				num[i] = n;
			}
			for (int j = 0; num[j] != 0; j++)
			{
				test = num[j];
				for (int k = 0; num[k] != 0; k++)
				{
					if (num[k] == 2 * test)
					{
						count++;
					}
				} //end for k
			} //end for j
			System.out.print(count);
			System.out.print("\n");
			count = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}

}

