package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] A = new int[200];
		int i;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 A[i] = Integer.parseInt(tempVar3);
		 }
		}
		for (p = 1;p <= (n - m);p++)
		{
		   A[n + p] = A[p];
		}
		for (q = (n - m + 1);q < (n + n - m);q++)
		{
		System.out.printf("%d ",A[q]);
		}
		System.out.printf("%d",A[n + n - m]);
	   return 0;
	}
}

