public class point
{
	public int y;
	public int m1;
	public int m2;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		point[] A = tangible.Arrays.initializeWithDefaultpointInstances(200);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			d = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i].y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i].m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				A[i].m2 = Integer.parseInt(tempVar4);
			}
			if (A[i].m1 < A[i].m2)
			{
			 if (A[i].y % 400 == 0 || (A[i].y % 4 == 0 && A[i].y % 100 != 0))
			 {
				for (j = A[i].m1;j < A[i].m2;j++)
				{
					d = d + a[j - 1];
				}
			 }
			 else
			 {
				for (j = A[i].m1;j < A[i].m2;j++)
				{
				   d = d + b[j - 1];
				}
			 }
			}
			else
			{
				if (A[i].y % 400 == 0 || (A[i].y % 4 == 0 && A[i].y % 100 != 0))
				{
				for (j = A[i].m2;j < A[i].m1;j++)
				{
					d = d + a[j - 1];
				}
				}
			 else
			 {
				for (j = A[i].m2;j < A[i].m1;j++)
				{
				   d = d + b[j - 1];
				}
			 }
			}
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}


}

