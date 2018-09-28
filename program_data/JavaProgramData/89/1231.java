package <missing>;

public class GlobalMembers
{
	/*
	 * FamousPerson.cpp
	 *
	 *  Created on: 2013-12-13
	 *      Author: KEVIN
	 */


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int knows,known;
	//	}
	//	person[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(person,0,sizeof(person));
		while (true)
		{
			int i;
			int j;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == j)
			{
				break;
			}
			person[i].knows++;
			person[j].known++;
		}
		for (int i = 0;i <= n - 1;++i)
		{
			if (person[i].known == n - 1 && person[i].knows < n - 1)
			{
				System.out.print(i);
				break;
			}
			else
			{
				if (i == n - 1)
				{
					System.out.print("NOT FOUND");
				}
			}
		}
		return 0;
	}
}

