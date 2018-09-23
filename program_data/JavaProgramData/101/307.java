package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] w = {'A', 'B', 'C'}; //???????????
		char t;
		int a;
		int b;
		int c;
		int sum1;
		int sum2;
		int sum3;
		int k;
		int i;
		int j;
		int[] q = new int[3];

		for (a = 0;a < 3;a++) //???????????0,1,2
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					sum1 = (b > a) + (a == c);
					sum2 = (a > b) + (a > c);
					sum3 = (c > b) + (b > a);
					if (a + sum1 == b + sum2 && b + sum2 == c + sum3) //???????????????
					{
						q[0] = a;
						q[1] = b;
						q[2] = c;
						for (j = 0;j < 2;j++) //?????????????
						{
						for (i = j;i < 2;i++)
						{
							if (q[i] > q[i + 1])
							{
								k = q[i];
								q[i] = q[i + 1];
								q[i + 1] = k;
								t = w[i];
								w[i] = w[i + 1];
								w[i + 1] = t;
							} //???????
						}
						}
						for (i = 0;i < 3;i++)
						{
							System.out.print(w[i]);
						}
						System.out.print("\n");
					}
				}
			}
		}
	return 0;
	}
}
