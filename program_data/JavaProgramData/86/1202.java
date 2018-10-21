package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] pause = new int[21]; //????
		int skip;
		int m;
		int[] time = new int[21];
		int i;
		int n;
		int counter = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
				counter++; //????????????n??????
				for (i = 1;i <= m;i++)
				{
					pause[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 1,skip = 60 - 3 * m;i <= m;i++) //????????skip????????m=1?0?????????
				{
					time[i] = pause[i] + 3 * i; //????????????
					if (time[i] >= 63)
					{
							skip = pause[i] + 63 - time[i]; //????????????????????????
							break;
					}
					else if (time[i] >= 60)
					{
						skip = pause[i];
						break;
					}
				}
				System.out.print(skip);
				System.out.print("\n");
		}

	return 0;
	}

}

