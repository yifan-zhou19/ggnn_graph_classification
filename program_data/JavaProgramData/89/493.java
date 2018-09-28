package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int e;
		int f;
		int i;
		int n;
		c = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] p = new int[100000];
		int[] q = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n * (n - 1) / 2);i++)
		{
							  String tempVar2 = ConsoleInput.scanfRead();
							  if (tempVar2 != null)
							  {
								  a[i] = Integer.parseInt(tempVar2);
							  }
							  String tempVar3 = ConsoleInput.scanfRead(" ");
							  if (tempVar3 != null)
							  {
								  b[i] = Integer.parseInt(tempVar3);
							  }
							  if (a[i] == 0 && b[i] == 0)
							  {
								  d = (i - 1);
							  }
							  if (a[i] == 0 && b[i] == 0)
							  {
								  break;
							  }
		}
		for (i = 0;i <= (n - 1);i++)
		{
							  for (f = 0;f <= d;f++)
							  {
									 if (a[f] == i)
									 {
									 p[i] = 1;
									 }
							  }
		}
		for (i = 0;i <= (n - 1);i++)
		{
							  for (f = 0;f <= d;f++)
							  {
									 if (b[f] == i)
									 {
									 q[i]++;
									 }
							  }
		}
		for (i = 0;i <= (n - 1);i++)
		{
							  if (p[i] == 0 && q[i] == (n - 1))
							  {
								  System.out.printf("%d",i);
							  c = 1;
							  }
		}
		if (c == 0)
		{
			System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

