package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] a = new char[1000][255];
	   int m;
	   int i;
	   int k;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < m;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = tempVar2.charAt(0);
		   }
	   }
	   for (j = 0;j < m;j++)
	   {
		   for (k = 0;k < 255;k++)
		   {
			   if (a[j][k] == 'A')
			   {
			   System.out.print("T");
			   }
			   else if (a[j][k] == 'T')
			   {
			   System.out.print("A");
			   }
			   else if (a[j][k] == 'C')
			   {
			   System.out.print("G");
			   }
			   else if (a[j][k] == 'G')
			   {
			   System.out.print("C");
			   }
		   }
		   System.out.print("\n");
	   }
	   return 0;
	}

}

