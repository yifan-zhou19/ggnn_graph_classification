package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int ai = 0;
		  int bi = 0;
		  int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a;
		  int b;
		  for (c = 0;c < n;c++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == b)
			{
					;
			}
			else
			{
			if (a == 0 && b == 1)
			{
			ai++;
			}
			else
			{
			  if (a == 1 && b == 2)
			  {
			  ai++;
			  }
			  else
			  {
				if (a == 2 && b == 0)
				{
				 ai++;
				}
				 else
				 {
				 bi++;
				 }
			  }
			}
			}
		  }
		  if (ai > bi)
		  {
		  System.out.print("A");
		  }
		  else
		  {
			  ;
		  }
		  if (ai == bi)
		  {
		  System.out.print("Tie");
		  }
		  else
		  {
			  ;
		  }
		  if (ai < bi)
		  {
		  System.out.print("B");
		  }
		  else
		  {
			  ;
		  }
	}

}

