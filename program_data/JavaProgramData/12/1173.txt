package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[16];
		int pause;
		int i;
		int k;
		int m;
		int count;

		for (;;)
		{
				count = 0;
				for (i = 0;i < 16;i++)
				{
						   String tempVar = ConsoleInput.scanfRead();
						   if (tempVar != null)
						   {
							   A[i] = Integer.parseInt(tempVar);
						   }
						   if (A[i] == 0 || A[i] == -1)
						   {
						   break;
						   }
				}
				if (A[i] == -1)
				{
							break;
				}
				for (i = 0;i < 16;i++)
				{
								if (A[i] == 0)
								{
									pause = i;
									 break;
								}
				}
				for (k = 0;k < pause;k++)
				{
						for (i = 0;i < pause;i++)
						{
								if (A[k] == 2 * A[i])
								{
									count++;
								}
						}
				}
				System.out.printf("%d\n",count);
		}
	   return 0;
	}


}

