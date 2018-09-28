package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] n = new int[100];
		int i;
		int j;
		a[0] = 1;
		for (i = 1;a[i - 1] != 0;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  d[i] = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  e[i] = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  f[i] = Integer.parseInt(tempVar6);
		  }
		  n[i] = (d[i] + 11 - a[i]) * 3600 + e[i] * 60 + f[i] + 60 - c[i] + (60 - b[i] - 1) * 60;
		}
		for (j = 1;j < i - 1;j++)
		{
		  System.out.printf("%d\n",n[j]);
		}
		return 0;
	}

}

