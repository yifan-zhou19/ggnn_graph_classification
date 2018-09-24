package <missing>;

public class GlobalMembers
{
	/*
	 * ditui5.cpp
	 *??????
	 *  Created on: 2011-11-15
	 *      Author: APPLE
	 */
	public static int Main() //?????
	{
		int[] m = new int[1000]; //????
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[1] = n + k;
		while (true)
		{
			for (i = 1;i <= n;i++) //????
			{
				m[i + 1] = (((m[i] - k) / n) * (n - 1));
		 if (i == n)
		 {
			 break;
		 }
		 if ((m[i + 1] % n) != k)
		 {
			 break;
		 }


			}
		if ((i == n) && (m[i + 1] / (n - 1)) >= 1) //????
		{
				System.out.print(m[1]);
				System.out.print("\n");
			break;
		}
		else
		{
			m[1] = m[1] + n;
		}

		}
		return 0; //?????
	}

}

