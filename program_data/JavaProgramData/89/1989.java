package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int c;
	  int i;
	  int d;
	  int s;
	  int[] a = new int[10000];
	  for (i = 0;i <= 9999;i++)
	  {
		  a[i] = 1;
	  }
	  int[] b = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  c = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  for (;(c != 0) || (d != 0);)
	  {
		b[d]++;
		a[c] = 0;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			d = Integer.parseInt(tempVar5);
		}
	  }
	  s = 0;
	  for (i = 0;(i <= n - 1) && (b[i] = n - 1);i++)
	  {
		if (a[i] != 0)
		{
			System.out.printf("%d\n",i);
			s++;
		}
	  }
	  if (s == 0)
	  {
		  System.out.print("NOT FOUND");
	  }
	  System.in.read();
	  System.in.read();
	}

}

