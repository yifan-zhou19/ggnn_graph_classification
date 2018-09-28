package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int[] c = new int[10000];
		  int d;
		  int e;
		  int[] f = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  while (a != 0 || b != 0)
		  {
		  for (d = 1;d <= a;d++)
		  {
		  c[d] = d;
		  }
		  for (;a >= 1;a--)
		  {
			 e = b % a;
			 if (e == 0)
			 {
			 e = a;
			 }
			  for (d = 1;d <= a;d++)
			  {
			  f[d] = c[d];
			  }
			 for (d = 1;d <= (a - e);d++)
			 {
			   c[d] = c[e + d];
			 }
			 for (d = a - e+1;d <= a - 1;d++)
			 {
			   c[d] = f[d - (a - e)];
			 }
		  }
		  System.out.printf("%d\n",c[1]);
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b = Integer.parseInt(tempVar4);
		  }
		  }

		  System.in.read();
		  System.in.read();
	}
}

