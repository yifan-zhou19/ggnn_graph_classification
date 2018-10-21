package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int aw; //????????????????????????
		int bw;
		int cw;
		int i; //???????????
		int j;
		int t;
		char[] m = {'A', 'B', 'C'}; //????????????
		char p;
		int[] n = new int[3]; //????????
		for (n[0] = 1;n[0] <= 3;n[0]++) //????
		{
			for (n[1] = 1;n[1] <= 3;n[1]++)
			{
				for (n[2] = 1;n[2] <= 3;n[2]++)
				{
					aw = ((n[1] > n[0]) + (n[2] == n[0])); //????????
					bw = ((n[0] > n[1]) + (n[0] > n[2]));
					cw = ((n[2] > n[1]) + (n[1] > n[0]));
					if (((n[0] > n[1]) && (aw < bw)) || ((n[1]> n[0]) && (bw < aw)) || ((n[1] == n[0]) && (bw == aw)))
					{
						if (((n[2] > n[1]) && (cw < bw)) || ((n[1]> n[2]) && (bw < cw)) || ((n[1] == n[2]) && (bw == cw)))
						{
							if (((n[0] > n[2]) && (aw < cw)) || ((n[2]> n[0]) && (cw < aw)) || ((n[2] == n[0]) && (cw == aw)))
							{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto l;
							}
						}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	for (i = 2;i > 0;i--) //???????????
	{
			for (j = 0;j < i;j++)
			{
				if (n[j] > n[j + 1])
				{
					t = n[j];
					p = m[j];
					n[j] = n[j + 1];
					m[j] = m[j + 1];
					n[j + 1] = t;
					m[j + 1] = p;
				}
			}
	}
		System.out.printf("%c%c%c",m[0],m[1],m[2]); //?????
		return 0;
	}
}
