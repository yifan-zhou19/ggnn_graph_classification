package <missing>;

public class GlobalMembers
{
	/*
	 * ????reverse-rank-of-int.cpp
	 * ??????
	 * ????:2012-12-14
	 * ???????
	 */
	public static int Main()
	{
		int n = 0; //????n,temp???A
		int temp = 0;
		int[] A = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			A[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int * p = A,*q = A + n - 1;p < q;p++,q--) //???????????????
		{
			temp = p;
			p = *q;
			*q = temp;
		}
		System.out.print(A);
		for (int i = 1;i < n;i++)
		{
			System.out.print(" ");
			System.out.print((A + i));
		}
		return 0; //?????
	}
}

