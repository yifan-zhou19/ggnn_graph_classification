package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] input = new int[300];
	   int i = 0;
	   int n = 0;
	   int[] num = new int[1000];
	  // for(i=0;i<1000;i++) printf("%d ",num[i]);
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
			   input[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		  num[input[i]]++;
		  if (num[input[i]] > 1)
		  {
			  input[i] = 0;
		  }
	   }
	//   for(i=0;i<10;i++)
	//   printf("%d ",num[i]);

	   System.out.printf("%d",input[0]);

	   for (i = 1;i < n;i++)
	   {
		  if (input[i] != 0)
		  {
			  System.out.printf(",%d",input[i]);
		  }
	   }
	   System.out.print("\n");
	}


}

