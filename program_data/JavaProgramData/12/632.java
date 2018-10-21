package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int[] a = new int[15];
		 int i;
		 int NO;
		 int tmp;
		 int n;
		 int j;
	 while (true)
	 {
	   n = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   tmp = Integer.parseInt(tempVar);
	   }
	   a[0] = tmp;
	   if (tmp == -1)
	   {
		   break;
	   }

	   NO = 0;

	   //for(i = 0; i < 101; i++) a[i] = 0; //a[i] ??i???? ? 0?????1???? ?????????? 

	  // a[tm] = 1;

	   while (true)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tmp = Integer.parseInt(tempVar2);
		}
		if (tmp == 0)
		{
			break;
		}
		a[++n] = tmp; // ???tmp??tmp??????1
	   }
	   for (i = 0; i < n ; i++)
	   {
		for (j = i + 1 ; j <= n ; j++)
		{
		  if (a[j] == 2 * a[i] || a[i] == 2 * a[j])
		  {
			  NO++;
		  }
		}
	   }

	   System.out.printf("%d\n",NO);


	 }
	 System.in.read();
	 System.in.read();
	 }


}

