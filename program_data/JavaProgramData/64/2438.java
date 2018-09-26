public class point
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int c;
		double[] R = new double[1000];
		double t;
		point[] A = tangible.Arrays.initializeWithDefaultpointInstances(10);
		point[] B = tangible.Arrays.initializeWithDefaultpointInstances(100);
		point[] C = tangible.Arrays.initializeWithDefaultpointInstances(100);
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
				A[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				A[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			   B[k].x = A[i].x;
			   B[k].y = A[i].y;
			   B[k].z = A[i].z;
			   C[k].x = A[j].x;
			   C[k].y = A[j].y;
			   C[k].z = A[j].z;
			   R[k] = Math.sqrt(Math.pow(1.0 * (B[k].x - C[k].x),2) + Math.pow(1.0 * (B[k].y - C[k].y),2) + Math.pow(1.0 * (B[k].z - C[k].z),2));
			   k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if (R[j] > R[j - 1])
				{
					t = R[j];
					R[j] = R[j - 1];
					R[j - 1] = t;
					c = B[j].x;
					B[j].x = B[j - 1].x;
					B[j - 1].x = c;
					c = B[j].y;
					B[j].y = B[j - 1].y;
					B[j - 1].y = c;
					c = B[j].z;
					B[j].z = B[j - 1].z;
					B[j - 1].z = c;
					c = C[j].x;
					C[j].x = C[j - 1].x;
					C[j - 1].x = c;
					c = C[j].y;
					C[j].y = C[j - 1].y;
					C[j - 1].y = c;
					c = C[j].z;
					C[j].z = C[j - 1].z;
					C[j - 1].z = c;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",B[i].x,B[i].y,B[i].z,C[i].x,C[i].y,C[i].z,R[i]);
		}
		  return 0;

	}

}

