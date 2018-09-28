package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100001]);
	   String p;
	   int t;
	   p = a;
	   int n;
	   int i;
	   int k;
	   int j;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int q = 0;
	   for (i = 1 ; i <= n ; i++)
	   {
		 p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 k = p.length();
		  for (j = 0 ; j <= k - 1 ; j++)
		  {
					 q = 0;
					 for (t = 0 ; t <= k - 1 ; t++)
					 {
						if (p.charAt(j) == p.charAt(t))
						{
						  q++;
						}

					 }
					 if (q == 1)
					 {
					  break;
					 }

		  }
					  if (q == 1)
					  {
						   System.out.print(p.charAt(j));
						   System.out.print("\n");

					  }
					   else
					   {
						   System.out.print("no");
						   System.out.print("\n");

					   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(p,0,(Character.SIZE / Byte.SIZE));
	   }
	   return 0;
	}
}

