package <missing>;

public class GlobalMembers
{
	//******************************************
	//*  ? ? ?:-1.2-                        * 
	//*  ?    ?:???                       * 
	//*  ????:10.6                         * 
	//*  ????:??7?????              * 
	public static int Main()
	{
	  float n;
	  int S = 0;
	  n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 1;i <= n;i++)
	  {
		int xi;
		int yi;
		int zi;
		if (i % 7 != 0)
		{
		   xi = i;
		   if (Math.floor(xi / 10.0) != 7)
		   {
			 yi = xi;
			 if (yi % 10 != 7)
			 {
			   zi = yi;
			   S = S + zi * zi;
			 }
		   }
		}
	  }
	   System.out.print(S);
	   System.out.print("\n");
	   return 0;
	}




}

