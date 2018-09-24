package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int A = 0; //??A\B\C???
		int B = 0;
		int C = 0;
		int i = 0; //??????
		int[] rank = new int[4]; //??????????????
		int[] word = new int[4];
		for (A;A < 4;A++)
		{
			for (B = 1;B < 4;B++)
			{
				if (A != B) //????,??????,??
				{
				for (C = 1;C < 4;C++)
				{
					if (B != C && A != C)
					{
					word[1] = (B > A) + (C == A);
					}
					word[2] = (A > B) + (A > C);
					word[3] = (C > B) + (B > A); //?????????
					rank[A] = 1;
					rank[B] = 2;
					rank[C] = 3; //????
					if (word[rank[3]] < word[rank[2]] && word[rank[2]] < word[rank[1]]) //??????"??????????"
					{
						for (i = 1;i < 4;i++)
						{
							System.out.print((char)(rank[i] + 64));
						} //????
					}
				}
				}
			}
		}
		return 0;
	} //?????
}
