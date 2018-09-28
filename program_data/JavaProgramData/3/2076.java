package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int[] a = new int[1001];
	  int i;
	  int j;
	  int sum;
	  int e = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   a[i] = Integer.parseInt(tempVar3);
					   }
	  }

	  for (i = 0;i < n - 1;i++)
	  {
						 for (j = i + 1;j < n;j++)
						 {
											sum = a[i] + a[j];
										   if (sum == k)
										   {
													  e = 1;
													  break;
										   }
						 }
						 if (e == 1)
						 {

						 break;
						 }



	  }
						 if (e == 1)
						 {
						  System.out.print("yes");
						 }
						 if (e != 1)
						 {
						 System.out.print("no");
						 }

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}




}

