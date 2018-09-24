package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int[] c = new int[100000];
		  int d;
		  int e;
		  e = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		 for (b = 1;b <= a;b++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c[b] = Integer.parseInt(tempVar2);
		 }
		 }
		 System.out.printf("%d",c[1]);
		 b = 2;
		 while (b <= a)
		 {
					e = 0;
		  for (d = 1;d < b;d++)
		  {
			if (c[b] == c[d])
			{
			e = 1;
			}
			else
			{
			e = e;
			}
		  }
			  if (e == 0)
			  {
			  System.out.printf(" %d",c[b]);
			  }
			  b = b + 1;
		 }
			  System.in.read();
			  System.in.read();
	}
}

