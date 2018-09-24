package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int[] shuzu = new int[16];
	   int i;
	   int j;
	   int k;
	   int number;
	   for (k = 1;1;k++)
	   {

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   shuzu[0] = Integer.parseInt(tempVar);
		   }
		   if (shuzu[0] == -1)
		   {
			   break;
		   }
			number = 1;
		   for (i = 1;i < 16;i++)
		   { //????

			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   shuzu[i] = Integer.parseInt(tempVar2);
			   }
			   if (shuzu[i] == 0)
			   {
				   break;
			   }
			   else
			   {
				   number++;
			   }
		   }


		   int zu = 0;
		   double a;
		   double b;
		   for (i = 0;i < number - 1;i++)
		   {
			   for (j = number - 1;j > i;j--)
			   {
				   a = (double)shuzu[i] / shuzu[j];
				   b = (double)shuzu[j] / shuzu[i];
				   if (a == 2 || b == 2)
				   {
					   zu++;
				   }
			   }
		   }
		   System.out.printf("%d\n",zu);



	   }

	}

}

