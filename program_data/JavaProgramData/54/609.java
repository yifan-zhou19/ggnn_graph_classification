package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????.cpp
	 * Created on: 2010-11-28
	 * Author: ???
	 */
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int num = n + 1;
		int[] apple = new int[num]; //???????????apple
		apple[n] = n + k; //??????????????
		while (true)
		{
			for (i = n - 1;i > 0;i--)
			{
				if (apple[i + 1] % (n - 1) != 0)
				{
					break;
				}
				apple[i] = apple[i + 1] * n / (n - 1) + k; //????
				if (apple[i] % n != k)
				{
					break;
				}
			} //??????????
			if (i == 0)
			{
				break;
			}
			apple[n] += n;
		}
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}

}

