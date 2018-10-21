package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int[] inpnum = new int[300];
		int max;
		float sum = 0F;
		float ave;
		float[] distance = new float[300];
		float tmpf;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++) //????
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   inpnum[i] = Integer.parseInt(tempVar2);
		   }
		   sum += inpnum[i];
		}
		ave = sum / n; //?????

		for (i = 0;i < n;i++) //????
		{
			if (inpnum[i] > ave)
			{
			distance[i] = inpnum[i] - ave;
			}
			else
			{
			distance[i] = ave - inpnum[i];
			}
		}
	   /* printf("the distances are:");
	    for(i=0;i<n;i++)
	    printf(" %f ",distance[i]);
	    printf("\n");*/

		for (i = 0;i < n - 1;i++) //??????????
		{
						for (j = 0;j < n - 1;j++)
						{
							if (distance[j] < distance[j + 1])
							{
								tmpf = distance[j];
								distance[j] = distance[j + 1];
								distance[j + 1] = tmpf;

								temp = inpnum[j];
								inpnum[j] = inpnum[j + 1];
								inpnum[j + 1] = temp;
							}
							else if (distance[j] == distance[j + 1] && inpnum[j] > inpnum[j + 1])
							{
								tmpf = distance[j];
								distance[j] = distance[j + 1];
								distance[j + 1] = tmpf;

								temp = inpnum[j];
								inpnum[j] = inpnum[j + 1];
								inpnum[j + 1] = temp;
							}
						}

		}
	   /* printf("\nafter the change, the diatances are:");
	        for(i=0;i<n;i++)
	    printf("%f ",distance[i]);
	    printf("\n");*/

		max = distance[0]; //max?????
		System.out.printf("%d",inpnum[0]); //??????????

		for (i = 1;i < n;i++) //?????????????
		{
			if (distance[i] == max)
			{
				System.out.printf(",%d",inpnum[i]);
			}
			else
			{
				break;
			}
		}

		return 0;
	}

}

