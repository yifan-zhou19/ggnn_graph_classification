package <missing>;

public class GlobalMembers
{
	//
	//  Created by Chu-Pan,Wong on Nov 11, 2013.
	//  Copyright (c) 2013 ChuPan,Wong. All rights reserved.
	//



	public static void Main(String[] args)
	{
		int n;
		int[] num = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = n - 1;j > i;j--)
			{
				if (num[j - 1] > num[j])
				{
					int tmp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = tmp;
				}
			}
		}
		int cnt = 0;
		for (int i = 0;i < n;i++)
		{
			if (num[i] % 2 == 1)
			{
				if (cnt != 0)
				{
					System.out.print(',');
				}
				System.out.print(num[i]);
				cnt++;
			}
		}
		System.out.print("\n");
	}

}

