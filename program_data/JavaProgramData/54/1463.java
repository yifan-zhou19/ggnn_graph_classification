package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  relocateapples
	//
	//  Created by ? ?? on 13-11-21.
	//  Copyright (c) 2013? LEE. All rights reserved.
	//


	public static int n; //??????????total??x??
	public static int k;
	public static int total = 0;
	public static float xishu = 0.0F;
	public static int Main()
	{
		int msees = new int(int x,int y);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total = n;
		int i;
		xishu = (float)n / (n - 1); //???????????????float??
	while (true)
	{
			for (i = 1;i <= n;i++)
			{
				if ((msees(i, k) - k) % n != 0) //???????????
				{
				break;
				}
			}

		if (i == n + 1)
		{
			break;
		}
		total += n;
	}
			System.out.print(msees(n, k));
			System.out.print("\n");

		return 0;
	}

	public static int msees(int x,int y)
	{
		if (x == 1)
		{
			return total + y; //??????????????????n+k???
		}
		return y + xishu * msees(x - 1, y); //??????
	}

}

