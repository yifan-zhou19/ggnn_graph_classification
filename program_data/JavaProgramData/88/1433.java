package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char q;
	   String p;
	   int now;
	   String tempVar = ConsoleInput.scanfRead(null, 1);
	   if (tempVar != null)
	   {
		   q = tempVar.charAt(0);
	   }
	   while (!((('0' <= q) && ('9' >= q))))
	   {
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 q = tempVar2.charAt(0);
			 }
		   //  printf("%c\n",q);
	   }
	   int tot = 0;
	   while (q != '\n')
	   {
			   if (('0' <= q) && ('9' >= q))
			   {
							  tot = tot * 10 + q - '0';
							  now = 1;
			   }
				   else if (tot != 0)
				   {
						   System.out.printf("%d\n",tot);
						   tot = 0;
						   now = 0;
				   }
			   String tempVar3 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar3 != null)
			   {
				   q = tempVar3.charAt(0);
			   }
	   }
	   if (now != 0)
	   {
		   System.out.printf("%d\n",tot);
	   }
		 //      scanf("%c",&q);
		 //      scanf("%c",&q);
	}

}

