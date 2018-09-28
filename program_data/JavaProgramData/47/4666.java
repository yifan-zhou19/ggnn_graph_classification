package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int[] A = new int[N];
		int[] B = new int[N];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   A[i] = Integer.parseInt(tempVar2);
		   }
		}
		System.out.printf("%d",A[n - 1]);
		for (i = 1;i < n;i++)
		{
			B[i] = A[n - 1 - i];

		System.out.printf(" %d",B[i]);
		}
	}


}

