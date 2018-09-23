package <missing>;

public class GlobalMembers
{
	/*???:???
	**?  ?:??
	**?  ?:2010?11?23?
	*/
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i;
		int[] j = new int[3];
		int[] r = new int[3];
		char[] R = {'A', 'B', 'C'};
		//???0,1,2??????,????????
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{
					r[0] = (B > A) + (C == A); //A?????
					r[1] = (A > B) + (A > C); //B?????
					r[2] = (C > B) + (B > A); //C?????
					j[0] = r[0] + A; //A??????A????
					j[1] = r[1] + B; //B??????B????
					j[2] = r[2] + C; //C??????C????
					//?????????,????????????2
					if (j[0] == 2 && j[1] == 2 && j[2] == 2)
					{
						for (i = 0; i <= 2; i++)
						{
							if (r[i] == 2)
							{
								j[0] = i;
							}
							if (r[i] == 1)
							{
								j[1] = i;
							}
							if (r[i] == 0)
							{
								j[2] = i;
							}
						} //??
						for (i = 0; i <= 2; i++)
						{
							System.out.print(R[j[i]]);
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}
