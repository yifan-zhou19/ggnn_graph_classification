package <missing>;

public class GlobalMembers
{
	/*
	 *6001.cpp
	 *??????????????????????????????????????
	?????????????????????????????
	 *Created on: 2012-10-28
	 *Author: ??
	 */
	public static int n = 0; //????
	public static int i = 0;
	public static int k = 0;
	public static int j = 0;
	public static int mid = 0;
	public static int p = 0;
	public static int t = 0;
	public static int[] shuru = new int[100000]; //????
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			shuru[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		p = n;
		while (n-- != 0)
		{
			if (shuru[i] != k)
			{
				i++;
				t++;
			}
			else
			{
				for (j = (i + 1);j < p;j++)
				{ //??????
					mid = shuru[i];
					shuru[j - 1] = shuru[j];
				}
				shuru[p - 1] = mid;
			}
		}
		System.out.print(shuru[0]);
		for (i = 1;i < t;i++)
		{ //?????
			if (shuru[i] != k)
			{
				System.out.print(' ');
				System.out.print(shuru[i]);
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

