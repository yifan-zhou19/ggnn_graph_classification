package <missing>;

public class GlobalMembers
{
	//********************************
	//?????????????
	//???:??
	//?????2010.10.29
	//?????????????
	//********************************
	public static int Main()
	{
		int n; //????????????
		int num;
		int[] a = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) //??????
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i - 1] = num;
			if (i == 1) //?????????
			{
				System.out.print(num);
			}
			else
			{
				int j = 0;
				while (j < i - 1) //???????????
				{
					if (a[j] == num)
					{
						break;
					}
					else
					{
						j++;
					}
				}
				if (j == i - 1)
				{
					System.out.print(" ");
					System.out.print(num);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}


}

