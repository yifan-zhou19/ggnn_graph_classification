package <missing>;

public class GlobalMembers
{
	//********************************************
	//??????
	/*???????N????500?????????
	?????????????????*/
	//********************************************
	public static int Main()
	{
	   int N; //a[]??????,i?j????
	   int[] a = new int[500];
	   int i;
	   int j;
	   int[] b = new int[500]; //b[]????,p????
	   int p;
	   N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < N;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[i] % 2 != 0)
		   {
			   b[i] = a[i];
		   }
	   }
	   for (j = 0;j < N;j++) //?????????
	   {
		  for (i = 0;i < N - j;i++) //????
		  {
			 if (b[i] > b[i + 1]) //??????
			 {
				p = b[i];
				b[i] = b[i + 1];
				b[i + 1] = p;
			 }
		  }
	   }
	   for (i = 0;i <= N;i++)
	   {
		  if (b[i] != 0 && i != N)
		  {
			  System.out.print(b[i]);
			  System.out.print(',');
		  }
		  else if (b[i] != 0 && i == N)
		  {
			  System.out.print(b[i]);
		  }
	   }
	   return 0;
	}
}

