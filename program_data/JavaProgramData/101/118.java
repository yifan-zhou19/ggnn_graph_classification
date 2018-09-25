package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ???.cpp                              *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?10?17?                          *
	//**********************************************************
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i = 0;
		int[] rank = {0, 0, 0, 0}; //??word????????rank??????????
		int[] words = {0, 0, 0, 0};
		for (A = 1;A < 4;A++)
		{
			for (B = 1;B < 4;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - B - A; //A?B?C???????
				words[1] = (B > A) + (A == C);
				words[2] = (A > B) + (A > C);
				words[3] = (C > B) + (B > A);
				rank[A] = 1;
				rank[B] = 2;
				rank[C] = 3; //??????????
				if (words[rank[1]] == 2 && words[rank[2]] == 1 && words[rank[3]] == 0) //???????????
				{
					for (i = 1;i < 4;i++)
					{
						System.out.print((char)(rank[i] + 64));
					}
																			  //?????????
				}
			}
		}
		return 0;
	}
}
