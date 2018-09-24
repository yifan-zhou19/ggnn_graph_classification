package <missing>;

public class GlobalMembers
{
	public static double FindFBN(int nplus2, int[] FBNplus2)
	{
		int i = 0;
		double dSum = 0.0;

		FBNplus2[0] = 1;
		FBNplus2[1] = 1;
		for (i = 2; i < nplus2; i++)
		{
			FBNplus2[i] = FBNplus2[i - 1] + FBNplus2[i - 2];
		}

		for (i = 0; i < nplus2 - 2; i++)
		{
			dSum += ((double)(FBNplus2[i + 2]) / (double)(FBNplus2[i + 1]));
		}
		System.out.printf("%.3lf\n",dSum);
		return dSum;
	}


	public static void Main(String[] args)
	{
		int m;
		int i;
		int[] FBNum;
		int[][] FBArray;
		double dSum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		FBNum = new int[m];
		FBArray = new int[m];

		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				FBNum[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0; i < m; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			FBArray[i] = (int) calloc((FBNum[i] + 2), (Integer.SIZE / Byte.SIZE));
			dSum = FindFBN(FBNum[i] + 2, FBArray[i]);
		}

	}

}

