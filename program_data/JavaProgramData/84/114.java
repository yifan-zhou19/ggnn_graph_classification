package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] input = new int[100];
	   int i = 0;
	   int j = 0;
	   int n = 0;
	   int t = 0;
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


	   for (i = 1;i < n;i++)
	   {
		  if (input[i] < input[i - 1])
		  {
		 t = input[i];
		 input[i] = input[i - 1];
		 input[i - 1] = t;
		  }
	   }
	   System.out.printf("%d\n",input[n - 1]);
	   input[j] = 0;

	   for (i = 1;i < n - 1;i++)
	   {
		  if (input[i] < input[i - 1])
		  {
		 t = input[i];
		 input[i] = input[i - 1];
		 input[i - 1] = t;
		  }
	   }
	   System.out.printf("%d\n",input[n - 2]);
	}

}

