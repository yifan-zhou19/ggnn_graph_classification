package <missing>;

public class GlobalMembers
{
	/*
	 *shuchubuchongfushuzi.cpp
	 *?????n????n???????????????10-100???
	 *???????????????????????????????????????????
	 *Created on: 2012-11-11
	 *Author: ??
	 */
	public static int Main()
	{
		int n = 0;
		int[] shuru = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{ //????
			shuru[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.print(shuru[0]);

		for (int i = 1; i < n; i++)
		{ //??????
			int jishu = 0;
			for (int j = 0; j < i; j++)
			{
				if (shuru[i] == shuru[j])
				{
					break;
				}
				else
				{
					jishu++;
				}
			}
			if (jishu == i) //????????
			{
				System.out.print(' ');
				System.out.print(shuru[i]);
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

