package <missing>;

public class GlobalMembers
{
	//********************************************************************
	//??????K???
	//?????????????K???
	//??????
	//********************************************************************
	public static int Main() //???


	{ //?????
		int n; //?????????
		int k;
		int[] num = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //??????
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int c = 1; //??????
		for (int j = 0; j < n; j++)
		{
				for (int m = 0; m < n; m++)
				{
					if (m == j)
					{
						continue;
					}
					else if (num[j] + num[m] == k)
					{
						  c = 0;
					}
				}
		}
		if (c == 1)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		if (c == 0)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		return 0;
	}

}

