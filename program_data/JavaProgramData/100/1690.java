package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[400]);
	   String p;
	   String q;
	   final String t = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	   int[] u = new int[100];
	   int i = 0;
	   int k = 0;
	   int j = 0;
	   int f = 0;
	   for (k = 0;k < 52;k++)
	   {
		   u[k] = 0;
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   for (q = t; q != '\0';q++)
	   {
		 for (p = s; p != '\0';p++)
		 {
		  if (p == q)
		  {
		   u[i]++;
		   f = 1;
		  }
		 }
		 i++;
	   }
	   for (q = t; q != '\0';q++)
	   {
		if (u[j] != 0)
		{
			System.out.printf("%c=%d", q,u[j]);
			System.out.print("\n");
		}
		j++;
	   }
	   if (f == 0)
	   {
		   System.out.print("No");
	   }
	return 0;
	}

}

