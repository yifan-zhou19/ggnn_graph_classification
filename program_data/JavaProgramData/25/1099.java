package <missing>;

public class GlobalMembers
{
	/* Name        : ??2?N??
	 * Version     : 1.0
	 * Date        : 2013-01-11
	 * New         : 
	 * Description : 
	 * State       : Design
	 */
	public static int Main()
	{
		int[] Num = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] Jinwei = new int[35];
		int N = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < N;k++)
		{
			for (int i = 0;i < 33;i++)
			{
				Num[i] = Num[i] * 2 + Jinwei[i];
				if (Num[i] > 9)
				{
					Num[i] = Num[i] - 10,Jinwei[i + 1] = 1;
				}
				else
				{
					Jinwei[i + 1] = 0;
				}
			}
		}
		for (int i = 34,Begin = 0;i > -1;i--)
		{
			if (Num[i] != 0 || Begin == 1)
			{
				System.out.print(Num[i],Begin = 1);
			}
		}
		return 0;
	}

}

