package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int t = 1;
	  int[] x = new int[100];
	  int[] y = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(x,0,100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(y,0,100 * (Integer.SIZE / Byte.SIZE));
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  for (i = 0;i < a.length();i++)
	  {
		  x[a.charAt(i) - 32]++;
	  }
	   for (i = 0;i < b.length();i++)
	   {
		  y[b.charAt(i) - 32]++;
	   }
	   for (i = 0;i < 100;i++)
	   {
		   if (x[i] != y[i])
		   {
			   t = 0;
		   }
	   }
	   if (t == 0)
	   {
		System.out.print("NO");
		System.out.print("\n");
	   }
	   else
	   {
		 System.out.print("YES");
		 System.out.print("\n");
	   }
		return 0;
	}
}

