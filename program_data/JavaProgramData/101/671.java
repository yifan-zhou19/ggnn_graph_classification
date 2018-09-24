package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (B == A)
				{
					continue;
				}
				for (C = 1;C <= 3;C++)
				{
					if (C == A || C == B)
					{
						continue;
					}
					int i;
					int j;
					int k;
					i = ((B > A) + (C == A));
					j = ((A > B) + (A > C));
					k = ((C > B) + (B > A));
					if (A + i == 3 && B + j == 3 && C + k == 3)
					{
						for (i = 1;i <= 3;i++)
						{
							if (A == i)
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
		return 0;
	}

}
