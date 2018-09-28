package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int len1;
	   int len2;
	   int n;
	   int i;
	   int j;
	   int k;
	   int[] result = new int[1000];
	   String num1 = new String(new char[101]);
	   String num2 = new String(new char[101]);
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		   int[] a = new int[1000];
		   int[] b = new int[1000];
		   int[] result = new int[1000];
		   num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		  len2 = num2.length();
		  len1 = num1.length();



		 for (j = len1 - 1,k = 0;j >= 0;j--,k++)
		 {
				 a[k] = num1.charAt(j) - '0';

		 }
			  for (j = len2 - 1,k = 0;j >= 0;j--,k++)
			  {
				 b[k] = num2.charAt(j) - '0';
			  }



			  for (k = 0;k <= len1 - 1;k++)
			  {
				  result[k] = result[k] + a[k] - b[k];
				  if (result[k] < 0)
				  {
					  result[k + 1]--;
					  result[k] += 10;
				  }



			  }
			  for (k = len1 - 1;k >= 0;k--)
			  {
				  System.out.print(result[k]);
			  }
			  System.out.print("\n");




	   }





	   return 0;
	}







}

