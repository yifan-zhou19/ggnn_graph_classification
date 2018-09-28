package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int s;
	   int i;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   while (n != 0)
	   {

				  s = 0;
				  for (i = 2;i <= n;i++)
				  {
				  s = (s + m) % i;
				  }
				  System.out.printf("%d\n",s + 1);
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  n = Integer.parseInt(tempVar3);
				  }
				  String tempVar4 = ConsoleInput.scanfRead(" ");
				  if (tempVar4 != null)
				  {
					  m = Integer.parseInt(tempVar4);
				  }
	   }



				 System.in.read();
				 System.in.read();
				 System.in.read();
	}

}

