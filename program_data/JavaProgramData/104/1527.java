package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[100];
		 int[] b = new int[100];
		 int n = 0;
		 int m = 0;
		 int i;
		 int j;
		 int k = 0;
		 a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 while (a[n] >= 1)
		 {
				a[n + 1] = a[n] / 2;
			//	cout<< a[n]<<n<<endl;
				n++;

		 }
			while (b[m] >= 1)
			{
				b[m + 1] = b[m] / 2;
				//cout<<b[m]<<m<<endl;
				m++;
			}
	   for (i = 0;i <= n;i++)
	   {
			  for (j = 0;j <= m;j++)
			  {
				  if (a[i] == b[j])
				  {
					  System.out.print(a[i]);
					  k = 1;
					 break;
				  }
			  }
		  if (k == 1)
		  {
			  break;
		  }
	   }

	}

}

