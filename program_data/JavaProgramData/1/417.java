package <missing>;

public class GlobalMembers
{
	public static int sum = 0; //???????
	public static void fj(int n,int m)
	{
		int i; //?????
		for (i = m;i <= Math.sqrt(n);i++) //???????
		{
			 if (n % i == 0)
			 {
				 sum++;
				 fj(n / i, i); //???????
			 }
		}
	}
	public static int Main()
	{
		int j; //??????????????
		int N;
		int[] a = new int[100]; //?????
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= N;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= N;j++)
		{
			sum = 0;
			fj(a[j], 2); //?????
			System.out.print(sum + 1);
			System.out.print("\n");
		}
		return 0;
	}

}

