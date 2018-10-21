package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ???
	//
	//  Created by Neptune on 12-10-9.
	//  Copyright (c) 2012? ??? 1200012777. All rights reserved.
	//

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		for (a = 10; a <= 50; a += 10)
		{
			for (b = 10; b <= 50; b += 10)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 10; c <= 50; c += 10)
				{
					if (a == c || b == c)
					{
						continue;
					}
					for (d = 10; d <= 50; d += 10)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
						else if ((a + b == c + d) + (a + d > b + c) + (a + c < b) == 3)
						{
							break;
						}
					}
					if ((a + b == c + d) + (a + d > b + c) + (a + c < b) == 3)
					{
						break;
					}
				}
				if ((a + b == c + d) + (a + d > b + c) + (a + c < b) == 3)
				{
					break;
				}
			}
			if ((a + b == c + d) + (a + d > b + c) + (a + c < b) == 3)
			{
				break;
			}
		}
		int[] weight = new int[4];
		String name = new String(new char[4]);
		weight[0] = a;
		weight[1] = b;
		weight[2] = c;
		weight[3] = d;
		name = tangible.StringFunctions.changeCharacter(name, 0, 'z');
		name = tangible.StringFunctions.changeCharacter(name, 1, 'q');
		name = tangible.StringFunctions.changeCharacter(name, 2, 's');
		name = tangible.StringFunctions.changeCharacter(name, 3, 'l');
		for (int i = 0; i < 3; i++)
		{
			for (int j = i + 1; j < 4; j++)
			{
				if (weight[j] > weight[i])
				{
					int weight_t = weight[j];
					weight[j] = weight[i];
					weight[i] = weight_t;
					int name_t = name.charAt(j);
					name = tangible.StringFunctions.changeCharacter(name, j, name.charAt(i));
					name = tangible.StringFunctions.changeCharacter(name, i, name_t);
				}

			}
		}

		for (int i = 0; i <= 3; i++)
		{
			System.out.print(name.charAt(i));
			System.out.print(" ");
			System.out.print(weight[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

