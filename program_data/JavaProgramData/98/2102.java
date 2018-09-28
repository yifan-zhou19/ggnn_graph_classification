package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] c = new char[1000][40];
	   String w = new String(new char[40]);
	   int n;
	   int i;
	   int j;
	   int k;
	   int[] a = new int[1000];
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
			  w = tempVar2.charAt(0);
		  }
		  for (j = 0;w.charAt(j) != '\0';j++)
		  {
			 c[i][j] = w.charAt(j);
			 c[i][j + 1] = '\0';
			 a[i]++;
		  }
	   }
	   k = 0;
	   for (i = 0;i < n;i++)
	   {
		  k += a[i] + 1;
		  if ((k + a[i + 1]) > 80)
		  {
			k = 0;
			for (j = 0;j < a[i];j++)
			{
			 System.out.printf("%c",c[i][j]);
			}
			System.out.print("\n");
			continue;
		  }
		  for (j = 0;j < a[i];j++)
		  {
		   System.out.printf("%c",c[i][j]);
		  }
		  if (i != (n - 1))
		  {
			System.out.print(" ");
		  }
	   }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

