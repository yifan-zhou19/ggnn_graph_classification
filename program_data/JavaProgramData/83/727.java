package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] s = new int[2][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		float[] A = new float[10];
		float[] B = new float[10];
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += s[0][i];
		}
		for (i = 0;i < n;i++)
		{
			if (s[1][i] >= 90)
			{
				A[i] = 4.0F;
			}
			else if (s[1][i] >= 85)
			{
				A[i] = 3.7F;
			}
			else if (s[1][i] >= 82)
			{
				A[i] = 3.3F;
			}
			else if (s[1][i] >= 78)
			{
				A[i] = 3.0F;
			}
			else if (s[1][i] >= 75)
			{
				A[i] = 2.7F;
			}
			else if (s[1][i] >= 72)
			{
				A[i] = 2.3F;
			}
			else if (s[1][i] >= 68)
			{
				A[i] = 2.0F;
			}
			else if (s[1][i] >= 64)
			{
				A[i] = 1.5F;
			}
			else if (s[1][i] >= 60)
			{
				A[i] = 1.0F;
			}
			else if (s[1][i] < 60)
			{
				A[i] = 0F;
			}
		}
		float gpa;
		float GPA;
		for (i = 0;i < n;i++)
		{
			B[i] = A[i] * s[0][i];
			gpa += B[i];
		}
		GPA = gpa / sum;
		System.out.printf("%.2f", GPA);
		return 0;
	}
}

