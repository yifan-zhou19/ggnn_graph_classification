package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m = 1;
	  int n;
	  int i;
	  int j;
	  int k;
	  int[] a = new int[301];
	  int[] b = new int[301];
	  while (m != 0)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < 301;i++)
		{
		   a[i] = 1,b[i] = 0;
		}
		for (i = 1;i < n;i++)
		{
		  j = 1;
		  k = 0;
		  while (k < m)
		  {
			 if (a[(j + b[i - 1]) % n] != 0) //????????????
			 {
				  k++;
			 }
			 if (k == m)
			 {
				  a[(j + b[i - 1]) % n] = 0; //?m?????????0????????
				  b[i] = (j + b[i - 1]) % n; //??????????
			 }
			 j++;
		  }
		}
	   for (i = 0;i < n;i++)
	   {
		 if (a[i] != 0)
		 {
			 if (i == 0)
			 {
				System.out.printf("%d\n",n);
			 }
			 else
			 {
				System.out.printf("%d\n",i);
			 }
			 break;
		 }
	   }
	  }
	}
}

