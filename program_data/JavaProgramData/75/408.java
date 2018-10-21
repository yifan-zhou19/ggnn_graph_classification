package <missing>;

public class GlobalMembers
{
	/*
	@file 1000012837_7.cpp
	@author ???
	@date 2010-11-26
	@description ?????
	*/
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int p;
		int[] come = new int[1000];
		int[] go = new int[1000];
		int[] time = new int[1001];
		int line = 1;
		int tmax = 0;
		int pmax = 0;
		char c;
		while (true)
		{
			if (line == 1) //?????
			{
				come[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c = System.in.read(); //???????
				if (c == '\n') //????????line++
				{
					line++;
				}
			}
			else if (line == 2) //??????
			{
				go[j++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c = System.in.read(); //???????
				if (go[j - 1] > tmax) //????????
				{
					tmax = go[j - 1];
				}
				if (c == '\n') //????????line++
				{
					line++;
				}
			}
			else
			{
				break; //??line??1?2??????????
			}
		}
		p = i; //????come??????
		//????????????????????
		for (i = 0; i < p; i++)
		{
			for (j = come[i]; j < go[i]; j++)
			{
				time[j]++;
			}
		}
		//?????????????
		for (i = 0; i <= tmax; i++)
		{
			if (time[i] > pmax)
			{
				pmax = time[i];
			}
		}
		System.out.print(p);
		System.out.print(" ");
		System.out.print(pmax);
		System.out.print("\n");
		return 0;
	}
}

