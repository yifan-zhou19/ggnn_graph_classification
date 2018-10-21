package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   int[] list1 = new int[300];
		   int[] list2 = new int[300];
		   int i;
		   int j;
		   int count = 0;
		   for (i = 0;i < n;i++)
		   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 list1[i] = Integer.parseInt(tempVar2);
			 }
		   }

		   for (i = 0;i < n - 1;i++)
		   {
			if (list1[i] == 0)
			{
				continue;
			}
			else
			{
				 list2[count] = i;
				 count++;
				 for (j = i + 1;j < n;j++)
				 {
					  if (list1[i] == list1[j])
					  {
					  list1[j] = 0;
					  }
				 }
			}
		   }
		   if (list1[n - 1] != 0)
		   {
					 list2[count] = n - 1;
					 count++;
		   }

		   for (i = 0;i < count - 1;i++)
		   {
					  System.out.printf("%d,",list1[list2[i]]);
		   }
		   System.out.printf("%d",list1[list2[count - 1]]);
		   return 0;
	}

}

