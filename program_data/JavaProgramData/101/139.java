package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????????
		int B;
		int C;
		int[] words = new int[4]; //??????????????
		int[] rank = new int[4]; //?????????????????
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C <= 3;C++)
				{
					if (B == C || A == C)
					{
						continue;
					}
					words[1] = (B > A) + (C == A);
					words[2] = (A > B) + (A > C);
					words[3] = (C > B) + (B > A);
					rank[A] = 1;
					rank[B] = 2;
					rank[C] = 3;
					if (words[rank[1]] > words[rank[2]] && words[rank[2]] > words[rank[3]]) //??????????????
					{
						System.out.print((char)(rank[1] + 64));
						System.out.print((char)(rank[2] + 64));
						System.out.print((char)(rank[3] + 64));
						System.out.print("\n");
					}
				}
			}
		}
				return 0;
	}
}
