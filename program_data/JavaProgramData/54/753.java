package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int dropnum;
		int[] monkey = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dropnum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		monkey[n] = dropnum;

		do
		{
			monkey[n] = monkey[n] + n;
			for (i = n - 1;i > 0;i--)
			{
			   if (monkey[i + 1] % (n - 1) != 0)
			   {
				   break;
			   }
			   else
			   {
				   monkey[i] = monkey[i + 1] * n / (n - 1) + dropnum;
			   }
			}
		}while (i >= 1);

		System.out.print(monkey[1]);
		System.out.print("\n");


		return 0;
	}


}

