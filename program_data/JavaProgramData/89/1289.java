package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		int[][] m = new int[100000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d = 0;
		for (i = 0;;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   m[i][1] = Integer.parseInt(tempVar3);
		   }
		   if ((m[i][0] == 0) && (m[i][1] == 0))
		   {
			break;
		   }
		}
		for (c = 0;c < n;c++)
		{
		  b = 0;
		  for (a = 0;a < i;a++)
		  {
			  if (m[a][1] == c)
			  {
				b++;
			  }
		  }
		  if (b == n - 1)
		  {
			   for (e = 0;e < i;e++)
			   {
				 if (m[e][0] == c)
				 {
				   d = 2;
				   break;
				 }
			   }
			   if (d == 0)
			   {
				System.out.printf("%d",c);
				d = 1;
			   }
				break;
		  }
		}
		 if (d != 1)
		 {
			System.out.print("NOT FOUND");
		 }
		 return 0;
	}
}

