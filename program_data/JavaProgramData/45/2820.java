package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String z1 = new String(new char[51]);
	   String z2 = new String(new char[51]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   z1 = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   z2 = tempVar2.charAt(0);
	   }
	   int p;
	   int q;
	   p = z1.length();
	   q = z2.length();
	   int i;
	   int[] g = new int[51];
	   int[] h = new int[51];
	   for (i = 0;i < p;i++)
	   {
		   g[i] = z1.charAt(i);
	   }
	   int j;
	   for (j = 0;j < q;j++)
	   {
		   h[j] = z2.charAt(j);
	   }
	   int x;
	   int m;
	   for (x = 0;x < p;x++)
	   {
		   int k;
		   for (k = 0;k < q;k++)
		   {
			   if (h[k] == g[x])
			   {
				   if (h[k + 1] == g[x + 1])
				   {
					   System.out.printf("%d",k);
					   m = 0;
					   break;
				   }

			   }
		   }
		   if (m == 0)
		   {
		   break;
		   }
	   }
	   return 0;
	}

}

