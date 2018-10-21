package <missing>;

public class GlobalMembers
{
	//???????????
	//?????? 1000012918
	//???10.28
	//???
	public static int Main()
	{
		int n; //count[num]???num????????????0
		int[] count = new int[101];
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count[num] == 0) //?????????
			{
				if (i == 1)
				{
					System.out.print(num);
				}
				else
				{
				System.out.print(" ");
				System.out.print(num);
				}
			}
				count[num]++; //?????????1
		}
		return 0;
	}
}

