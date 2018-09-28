package <missing>;

public class GlobalMembers
{
	/*
	 *7001.cpp
	 *??????????N????500???????????????????????????
	 *Created on: 2012-11-3
	 *Author: ??
	 */
	public static int N = 0; //????
	public static int i = 0;
	public static int j = 0;
	public static int[] shuru = new int[500];
	public static int[] jishu = new int[500];
	public static int mid = 0;
	public static int p = 0;
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++) //????
		{
			shuru[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		j = 0;
		p = 0;
		for (i = 0;i < N;i++) //?????????
		{
			if ((shuru[i] % 2) == 1)
			{
				jishu[j] = shuru[i];
				j++;
				p++;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < p - 1;i++) //????
		{
			for (j = 0;j < p - i - 1;j++)
			{
				if (jishu[j] >= jishu[j + 1])
				{
					mid = jishu[j];
					jishu[j] = jishu[j + 1];
					jishu[j + 1] = mid;
				}
			}
		}
		System.out.print(jishu[0]);
		for (i = 1;i < p;i++) //?????
		{
			System.out.print(',');
			System.out.print(jishu[i]);
		}
		return 0;
	}

}

