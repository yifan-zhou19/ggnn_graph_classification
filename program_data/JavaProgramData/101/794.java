package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????
		int B;
		int C;
		int s1;
		int s2;
		int s3;
		int[] shu = new int[4];
		for (A = 1;A <= 3;A++) //????
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					s1 = (B > A) + (A == C);
					s2 = (A > B) + (A > C);
					s3 = (C > B) + (B > A);
					if (A + s1 == 3 && B + s2 == 3 && C + s3 == 3) //????
					{
						for (int i = 1;i <= 3;i++)
						{
							if (A == i) //?????
							{
								System.out.print("A");
							}
							if (B == i)
							{
								System.out.print("B");
							}
							if (C == i)
							{
								System.out.print("C");
							}
						}
					}
				}
			}
		}
				return 0; //??
	}
}
