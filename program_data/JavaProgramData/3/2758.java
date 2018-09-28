package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int num;
		int[] a = new int[N];
		int[] b = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (a[i]) = Integer.parseInt(tempVar3);
		   }
		}
	   for (k = 0;k < n - 1;k++)
	   {
		   for (i = 1;i < n - k;i++)
		   {
			   if (a[k] + a[k + i] == num)
			   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto done;
			   }
		   }

	   }


//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   done:
	   if (k >= n - 1)
	   {
				System.out.print("no");
	   }
			else
			{
				 System.out.print("yes");
			}
		return 0;
	}







}

