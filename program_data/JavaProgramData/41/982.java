package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r1;
		int r2;
		int sum;
		int[] A = new int[5];
		int[] a = new int[5];
		for (A[4] = 1; A[4] < 6; A[4]++)
		{
			if (A[4] == 2 || A[4] == 3)
			{
				continue;
			}
			for (A[0] = 1; A[0] < 6; A[0]++)
			{
				if (A[0] == A[4])
				{
					continue;
				}
				for (A[1] = 1; A[1] < 6; A[1]++)
				{
					if (A[0] == A[1] || A[4] == A[1])
					{
						continue;
					}
					for (A[2] = 1; A[2] < 6; A[2]++)
					{
						if (A[0] == A[2] || A[1] == A[2] || A[4] == A[2])
						{
							continue;
						}
						A[3] = 15 - A[0] - A[1] - A[2] - A[4];
						a[0] = (A[4] == 1);
						a[1] = (A[1] == 2);
						a[2] = (A[0] == 5);
						a[3] = (A[2] != 1);
						a[4] = (A[3] == 1);
						sum = a[0] + a[1] + a[2] + a[3] + a[4];
						if (sum == 2)
						{
							for (i = 0; i < 5; i++)
							{
								if (A[i] == 1)
								{
									r1 = i;
								}
								if (A[i] == 2)
								{
									r2 = i;
								}
							}
							if (a[r1] == 1 && a[r2] == 1)
							{
								System.out.print(A[0]);
								System.out.print(' ');
								System.out.print(A[1]);
								System.out.print(' ');
								System.out.print(A[2]);
								System.out.print(' ');
								System.out.print(A[3]);
								System.out.print(' ');
								System.out.print(A[4]);
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
