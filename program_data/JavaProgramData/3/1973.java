package <missing>;

public class GlobalMembers
{
	//************************************************
	//???K?????
	/*?????????n(n<1000)??????????
	???????????k?*/
	//************************************************ 
	public static int Main()
	{
	   int k; //a[]??n??
	   int n;
	   int i;
	   int j;
	   int[] a = new int[1000];
	   int[] b = new int[1000];
	   int sum = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++) //for??????n??
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			 if (a[i] + a[j] == k) //??b[]???????????k
			 {
				   b[i] = 1; //???b[i](i=1,2��)??=1
				   break;
			 }
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  sum = sum + b[i]; //??b[]??
	   }
	   if (sum == 0)
	   {
		  System.out.print("no");
	   }
	   else
	   {
		  System.out.print("yes");
	   }
		  System.in.read();
	   return 0;
	}
}

