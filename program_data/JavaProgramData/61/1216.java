package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????????                   **
	//*?????? 1100012763              **
	//*???2011.9.29                      **
	//****************************************
	public static int Main()
	{
		int n;
		int i;
		int a;
		int[] feibo = new int[20];

		feibo[0] = 1; //????????
		feibo[1] = 1;
		for (i = 2; i <= 19; i++)
		{
			feibo[i] = feibo[i - 1] + feibo[i - 2];
		}

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(feibo[a - 1]);
			if (i != n)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}

}

