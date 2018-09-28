package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int m1;
	   int m2;
	   char q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   m1 = a;
	   m2 = -100;
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   q = tempVar2.charAt(0);
	   }
	   while (q == ',')
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar4 != null)
		 {
			 q = tempVar4.charAt(0);
		 }
	 //    printf("%d %d\n",m1,m2);
		 if (a > m1)
		 {
			 m2 = m1;
			 m1 = a;
		 }
			else
			{
			if ((a > m2) && (a < m1))
			{
			m2 = a;
			}
			}
	   }
	  if (m2 == -100)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  System.out.printf("%d\n",m2);
	  }
	  // scanf("%d",&a);

	   return 0;

	}

}

