package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[] input = new int[20000];
		   int[] output = new int[20000];
		   int n;
		   int i;
		   int j;
		   int outLen = 1;
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
			   output[outLen] = input[i];
			   for (j = 1;j < outLen;j++)
			   {
				   if (input[i] == output[j])
				   {
					   outLen = outLen - 1;
				   }
				   /*else output[outLen]=input[i]; */

			   }
			   outLen = outLen + 1;
		   }

		   for (i = 1;i < outLen;i++)
		   {
			   System.out.printf("%d",output[i]);
			   if (i != outLen - 1)
			   {
				   System.out.print(" ");
			   }
		   }

	}
}

