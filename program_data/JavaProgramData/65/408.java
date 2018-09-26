package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int c;
		  int d;
		  int a = 0;
		  int b = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		 for (i = 0;i < n;i++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  d = Integer.parseInt(tempVar3);
		  }
		  if (c == 0 && d == 1)
		  {
			  a++;
		  }
	   if (c == 0 && d == 2)
	   {
		   b++;
	   }
		   if (c == 1)
		   {
			 if (d == 0)
			 {
				 b++;
			 }
		 else if (d == 2)
		 {
			 a++;
		 }
		   }
		else if (c == 2)
		{
			 if (d == 0)
			 {
				 a++;
			 }
		 if (d == 1)
		 {
			 b++;
		 }
		}

		 }
							  if (a > b)
							  {
								  System.out.print("A");
							  }
							  else if (a < b)
							  {
								  System.out.print("B");
							  }
							  else
							  {
								  System.out.print("Tie");
							  }
	}


}

