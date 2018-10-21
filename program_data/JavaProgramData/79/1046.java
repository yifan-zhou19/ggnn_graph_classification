package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int j;
		int s;
		int p;
		int m;
		int n;
		for (i = 0;;i++)
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
		  if (a[i] == 0 && b[i] == 0)
		  {
			  break;
		  }
		}
		  for (j = 0;j < i;j++)
		  {
		 if (a[j] == 1)
		 {
		 System.out.print("1\n");
		 }
		 else
		 {
			 s = 0;
			 n = a[j];
			  m = b[j];
			  for (p = 2; p <= n; p++)
			  {
			   s = (s + m) % p;
			  }
			   System.out.printf("%d\n", s + 1);
		 }
		  }

		System.in.read();
		System.in.read();
		System.in.read();
	}
}

