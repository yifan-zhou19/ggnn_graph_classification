package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????????????
		int n;
		int k;
		int sum = 1;
		int[] A = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		while (k >= 10) //???????
		{
			k = k / 10;
			sum = sum + 1;
		}
		for (i = 0;i < sum;i++) //????? ?
		{
			A[i] = n % 10;
			n = n / 10;
		}
		for (i = 0;i < sum;i++) //?????
		{
			System.out.print(A[i]);
		}
		return 0;
	}
}

