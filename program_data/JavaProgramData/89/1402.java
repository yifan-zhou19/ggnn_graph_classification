package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] p;
		  int i;
		  int j;
		  int a;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  p = new int[n];
		  for (i = 0;i < n;i++)
		  {
			  p[i] = 0;
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  while (a != 0 || b != 0)
		  {
				p[b]++;
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					b = Integer.parseInt(tempVar5);
				}
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (p[i] == n - 1)
			  {
			  System.out.printf("%d",i);
			  break;
			  }
		  }
		  if (i == n)
		  {
			  System.out.print("NOT FOUND");
		  }
	}

}

