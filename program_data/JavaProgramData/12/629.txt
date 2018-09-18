package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] A = new int[16];
		int sum;
		int j;
		int i;
		int k;
		int m;
		for (j = 0;;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[0] = Integer.parseInt(tempVar);
			}
			if (A[0] == -1)
			{
			while (A[0] != 0 && A[0] != -1)
			{
				sum = 0;
				for (i = 1;;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						A[i] = Integer.parseInt(tempVar2);
					}
					if (A[i] == 0)
					{
						break;
					}
				}
				for (k = 0;k < i;k++)
				{
						 for (m = 0;m < i;m++)
						 {
								  if (A[k] == A[m] * 2)
								  {
									sum = sum + 1;
								  }
						 }
				}
				 System.out.printf("%d\n",sum);
				 break;
			}
			}
		}
	}
}

