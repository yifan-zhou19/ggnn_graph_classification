package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int y = 0;
	   int[] s = new int[1000];
	   int[] z = new int[1000000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   int i;
	   int u;
	   int j;
	   int v;
	   for (i = 0;i < n;i++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   s[i] = Integer.parseInt(tempVar3);
	   }
	   }
	   for (u = 0;u < n;u++)
	   {
		 for (j = u + 1;j < n;j++)
		 {
		   z[y] = s[u] + s[j];
		   y++;
		 }
	   }
	   int a = 0;
	   for (v = 0;v < y;v++)
	   {
		 if (z[v] == k)
		 {
		  a = 1;
		  break;
		 }
	   }
	   if (a == 1)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }
	   return 0;
	}
}

