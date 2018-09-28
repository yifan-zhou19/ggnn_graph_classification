package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int w;
	   int month;
	   int xqj;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   w = Integer.parseInt(tempVar);
	   }

	   for (month = 1;month <= 12;month++)
	   {
		   int dijit = 13;
		   for (int i = 1;i < month;i++)
		   {
			   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			   {
					dijit += 31;
			   }
			   else if (i == 2)
			   {
					dijit += 28;
			   }
			   else
			   {
					dijit += 30;
			   }
		   }

		  xqj = (dijit + w - 8) % 7;
		  if (xqj == 5)
		  {
			  System.out.printf("%d\n",month);
		  }
	   }

	   return 0;
	}

}

