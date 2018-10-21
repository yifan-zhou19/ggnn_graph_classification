package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int[][] d = new int[3][3];
		int i = 0;
		int j = 0;
		int p = 0;
		char[][] f = new char[2][2];
		for (A = 0;A < 3;A++)
		{
				for (B = 0;B < 3;B++)
				{
					for (C = 0;C < 3;C++)
					{
					d[0][0] = A;
					d[0][1] = (B > A);
					d[0][2] = (C == A);
					d[1][0] = B;
					d[1][1] = (A > B);
					d[0][2] = (A > C);
					d[2][0] = C;
					d[2][1] = (C > B);
					d[2][2] = (B > A);
					for (i = 0;i < 3;i++)
					{
						if (d[i][0] == 2 - d[i][1] - d[i][2])
						{

						p++;
						}

					}
					if (p == 3)
					{

							if (A > B > C)
							{
							System.out.print("ABC");
							System.out.print("\n");
							}
							if (A > C > B)
							{
								System.out.print("ACB");
								System.out.print("\n");
							}
							if (B > A > C)
							{
								System.out.print("BAB");
								System.out.print("\n");
							}
							if (B > C > A)
							{
								System.out.print("BCA");
								System.out.print("\n");
							}
							if (C > A > B)
							{
								System.out.print("CAB");
								System.out.print("\n");
							}

							if (C > B > A)
							{
								System.out.print("CBA");
								System.out.print("\n");
							}
						break;
					}
					}
					if (p == 3)
					{
						break;
					}
				}
				if (p == 3)
				{
					break;
				}
		}

				return 0;
	}


}
