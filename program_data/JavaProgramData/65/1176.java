package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[200];
	  int[] b = new int[200];
	  int i;
	  int j;
	  int k;
	  int n;
	  j = 0;
	  k = 0;
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
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		 if (a[i] == 0)
		 {
		   if (b[i] == 1)
		   {
			   j++;
		   }
		   else
		   {
			   if (b[i] == 2)
			   {
				   k++;
			   }
		   }
		 }
		 if (a[i] == 1)
		 {
		   if (b[i] == 2)
		   {
			   j++;
		   }
		   else
		   {
			   if (b[i] == 0)
			   {
				   k++;
			   }
		   }
		 }
		 if (a[i] == 2)
		 {
		   if (b[i] == 0)
		   {
			   j++;
		   }
		   else
		   {
			   if (b[i] == 1)
			   {
				   k++;
			   }
		   }
		 }
	  }
	   if (j == k)
	   {
		   System.out.print("Tie");
	   }
	   else
	   {
		 if (j > k)
		 {
			 System.out.print("A");
		 }
		 else
		 {
			 System.out.print("B");
		 }
	   }
	return 0;
	}


}

