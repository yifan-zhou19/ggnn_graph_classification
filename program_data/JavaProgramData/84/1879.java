package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   int temp;
	   int[] an = new int[MAX_NUM];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   i = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j < i;j++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			an[j] = Integer.parseInt(tempVar2);
		}
	   }

	   for (j = 0;j < i - 1;j++)
	   {
		  for (k = j + 1;k <= i;k++)
		  {
			if (an[j] < an[k])
			{
				 temp = an[j];
				 an[j] = an[k];
				 an[k] = temp;
			}
		  }
	   }

		for (j = 0;j <= 1;j++)
		{
		  System.out.printf("%d\n",an[j]);
		}
	   /* scanf("%d",&i);
	     for (j=0;j<i;j++)
	    scanf("%d\n",&an[j]);*/
		return 0;

	}

}

