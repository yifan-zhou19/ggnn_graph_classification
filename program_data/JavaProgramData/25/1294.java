package <missing>;

public class GlobalMembers
{
	/**
	????5.cpp
	?  ?????
	?  ??11.16
	?  ????2?N??
	*/
	public static int Main()
	{

		int N;
		int i;
		int j;
		int flag = 0;
		int[] ans = new int[32]; // ???2^100?31???????????32
		ans[31] = 1;


		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (N == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (i = 0 ; i < N ; i++)
			{
				for (j = 31 ; j >= 0 ; j--)
				{
					ans[j] = 2 * ans[j] + flag;
					if (ans[j] >= 10)
					{
						ans[j] -= 10;
						flag = 1;
					}
					else
					{
						flag = 0;
					}
				}
			}
			i = 0;
			while (ans[i] == 0)
			{
				i++;
			}
			for (; i < 32 ; i++)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}




}

