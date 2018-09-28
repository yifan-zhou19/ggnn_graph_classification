package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] A = {100, 50, 20, 10, 5, 1};
		int[] B = new int[6];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		B[0] = n / A[0];
		for (i = 1;i < 6;i++)
		{
			n = n - A[i - 1] * B[i - 1];
			B[i] = n / A[i];
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",B[i]);
		}
		return 0;
	}
}

