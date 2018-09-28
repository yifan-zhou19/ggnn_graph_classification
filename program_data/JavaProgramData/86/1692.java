package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int k = 0;k < n;k++)
	 {
	   int m = 0;
	   int number = 0;
	   int temp = 0;
	   int[] a = new int[100];
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 1;i <= m;i++) //???????????
	   {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   temp = a[m] + 3 * m; //??????
	   if (temp <= 60) //????60???
	   {
		 number = 60 - 3 * m;
		 System.out.print(number);
		 System.out.print("\n");
	   }
	   else if (temp > 60 && temp <= 63) //????60?63?
	   {
		  System.out.print(a[m]);
		  System.out.print("\n");
	   }
	   else //??????????????????????
	   {
			   for (int i = 1;i < m;i++)
			   {
								   temp = a[m - i] + 3 * (m - i);
								   if (temp <= 60) //?m-i???????
								   {
								   number = 60 - 3 * (m - i);
								   System.out.print(number);
								   System.out.print("\n");
								   break;
								   }
								   else if (temp > 60 && temp <= 63)
								   {
										System.out.print(a[m - i]);
										System.out.print("\n");
										break;
								   }

			   }
	   }
	 }

	}


}

