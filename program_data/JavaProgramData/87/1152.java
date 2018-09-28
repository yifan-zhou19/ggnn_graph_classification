package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int[] m = new int[1000];
		int[] n = new int[1000];
		int[] s = new int[1000];
		int i;
		int j;

		for (i = 0;i < 1000;i++)
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
		  if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
		  {
			break;
		  }
		  else
		  {
		   continue;
		  }
		}
		for (j = 0;j < i;j++)
		{
		  m[j] = a[j] * 3600 + b[j] * 60 + c[j];
		  n[j] = (d[j] + 12) * 3600 + e[j] * 60 + f[j];
		  s[j] = n[j] - m[j];
		  System.out.printf("%d\n",s[j]);
		}
				return 0;
	   }


}

