package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[300];
	   int[] b = new int[300];
	   int i;
	   int j;
	   int n;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }

	   for (i = 0;i < n;i++)
	   {
		for (j = 0;j < i;j++)
		{
		 if (a[i] == a[j])
		 {
		   b[i] = 1;
		   continue;
		 }
		}
	   }


	   {
		  int flag = 0;
		  for (i = 0;i < n;i++)
		  {
		  if (b[i] == 0 && flag == 0)
		  {
		   flag = 1;
		   System.out.printf("%d",a[i]);
		   continue;
		  }

		   if (b[i] == 0 && flag == 1)
		   {
		   System.out.printf(",%d",a[i]);
		   }
		  }
	  }

	}


}

