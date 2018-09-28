package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	// int a[100000];//?????????
	 int temp;
	 int p;
	 int q;
	 int c;
	 int w = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 //k=n-m;
	 //for(i=0;i<=k;i++)
	 //{
	 // a[i]=m+i;
	 //}

	 for (;m <= n;m++)
	 {
	  temp = m;
	  q = 0; //q??????????????//
	  while (temp > 0)
	  {
		   p = temp % 10;
		   q = q * 10 + p;
		   temp = temp / 10;
	  }
		  if (q == m)
		  {
		//   printf("%d\n", a[i]);
		   for (c = 2;c < m;c++)
		   {
			   if (m % c == 0)
			   {
				break;
			   }
		   }
		   if (c >= m)
		   {
			   w++;
			   if (w == 1)
			   {
				   System.out.printf("%d", m);
			   }
			   else
			   {
				   System.out.printf(",%d", m);
			   }
		   }
		  }
	 }
	 if (w == 0)
	 {
		 System.out.print("no");
	 }
	 System.out.print("\n");
	 return 0;
	}
}

