package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ds
	//
	//  Created by Love on 12-12-27.
	//  Copyright (c) 2012? Love. All rights reserved.
	//

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}

			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			int[] num = new int[100];
			for (int j = 1; j <= m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}

			}

				if (num[m] + 3 * m <= 60)
				{
					System.out.printf("%d\n",(60 - 3 * m));

				}
				else
				{
					int c = 1;
					for (int k = m; k > 1; k--)
					{
						if (num[k] + 3 * (k - 1) <= 60 && num[k] + 3 * k>60)
						{
							System.out.printf("%d\n",num[k]);
							c = 0;
							break;

						}
						else if (num[k - 1] + 3 * (k - 1) < 60 && num[k] + 3 * (k - 1)>60)
						{
							System.out.printf("%d\n",(60 - 3 * (k - 1)));
							c = 0;
							break;

						}

					}




				}
		}
		return 0;

	}
}

