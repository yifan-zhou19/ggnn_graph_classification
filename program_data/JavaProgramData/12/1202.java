package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*  ?  ?: ??                                       *
	//*  ?  ?: ???  1200012861                         *
	//*  ?  ?: 2012?10?9?                              *
	//*******************************************************
	public static int Main()
	{
		int n;
		int[] num = new int[15];
		int i;
		int j;
		int s;
		int t;
		int answer;
		while ((num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (num[0] == -1)
			{
				break; //???????-1?????
			}
			j = 0; //???????j
			answer = 0; //??????????????
			do
			{
				j++;
				num[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			} while (num[j] != 0); //????0?????
			for (s = 0; s < j; s++)
			{
				for (t = 0; t < j; t++)
				{
					if (num[t] == 2 * num[s]) //?????????????
					{
						answer++; //??+1
					}
				}
			}
			System.out.print(answer);
			System.out.print("\n");
		}
	return 0;
	}

}

