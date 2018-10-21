package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[][] A = new float[100][3];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i][1] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				A[i][2] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2] > 0F)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(-A[i][1] + Math.sqrt(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2])) / (2 * A[i][0]),(-A[i][1] - Math.sqrt(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2])) / (2 * A[i][0]));
			}
			else if (A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2] == 0F)
			{
				System.out.printf("x1=x2=%.5f\n",(-A[i][1]) / (2 * A[i][0]));
			}
			else if (A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2] < 0F)
			{
				if ((-A[i][1]) / (2 * A[i][0]) == 0)
				{
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(A[i][1]) / (2 * A[i][0]),(Math.sqrt(-(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2]))) / (2 * A[i][0]),(A[i][1]) / (2 * A[i][0]),(Math.sqrt(-(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2]))) / (2 * A[i][0]));
				}
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-A[i][1]) / (2 * A[i][0]),(Math.sqrt(-(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2]))) / (2 * A[i][0]),(-A[i][1]) / (2 * A[i][0]),(Math.sqrt(-(A[i][1] * A[i][1] - 4 * A[i][0] * A[i][2]))) / (2 * A[i][0]));
			}
			}
		}
		return 0;
	}


}

