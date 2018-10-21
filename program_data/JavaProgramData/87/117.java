package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int u = 1;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] g = new int[100];
		do
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[u] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   b[u] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   c[u] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   d[u] = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ");
		   if (tempVar5 != null)
		   {
			   e[u] = Integer.parseInt(tempVar5);
		   }
		   String tempVar6 = ConsoleInput.scanfRead(" ");
		   if (tempVar6 != null)
		   {
			   f[u] = Integer.parseInt(tempVar6);
		   }
		   g[u] = (d[u] + 12 - a[u]) * 3600 + (e[u] - b[u]) * 60 + f[u] - c[u];
		   u++;

		} while (a[u - 1] + b[u - 1] + c[u - 1] + d[u - 1] + e[u - 1] + f[u - 1] != 0);
		for (i = 1;i <= u - 2;i++)
		{
			System.out.printf("%d\n",g[i]);
		}

		return 0;
	}
}

