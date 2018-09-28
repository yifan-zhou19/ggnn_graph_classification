package <missing>;

public class GlobalMembers
{
	/*
	 * qimomoni_1.cpp
	 *    3
	 *  Created on: 2011-1-8
	 *      Author: ???
	 */

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct person
	//	{
	//		int a; //a ????????b????????
	//		int b;
	//	}
	//	p[10000];
		int i;
		int g = 0;
		int a1;
		int a2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				p[i].a = 0;
			p[i].b = 0;
		}
		while (true)
		{
			a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a1 == 0) && (a2 == 0))
			{
				break;
			}
			p[a1].a++;
			p[a2].b++;
		}
			 g = 0;
		for (i = 0;i < n;i++)
		{
			if ((p[i].b == n - 1) && (p[i].a == 0))
			{
					System.out.print(i);
					System.out.print("\n");
				g = 1;
				break;
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

