package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] A = new int[50003];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			A[i] = 1;
		}
		for (i = 4;i <= n;i += 2)
		{
			A[i] = 0;
		}
		A[1] = 0;
		for (i = 3;i < Math.sqrt((double)n);i += 2) //???????
		{
			for (k = 2;k * i <= n;k++)
			{
				A[k * i] = 0;
			}
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j < i;j++)
			{
				if (A[j] == 1 && A[i - j] == 1) //?????????
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}


}

