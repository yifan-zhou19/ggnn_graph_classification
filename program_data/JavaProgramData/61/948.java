package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20]; //????????????????.??????????a[],????a?????
		int n;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i = i + 1;
		}
		int C;
		i = 1;
		while (i <= n)
		{
			if (a[i] == 1) //????????????????????
			{
					System.out.print("1");
					System.out.print("\n");
				 i = i + 1;
			}
			else if (a[i] == 2)
			{
				System.out.print("1");
				System.out.print("\n");
				i = i + 1;
			}
			else
			{
				int A = 1;
				int B = 1;
				while (a[i] - 2 > 0) //??????????????
				{
					C = A + B; //?????????????
					A = B;
					B = C;
					a[i] = a[i] - 1;
				}
				System.out.print(C);
				System.out.print("\n");
				i = i + 1;
			}

		}
		return 0;
	}

}

