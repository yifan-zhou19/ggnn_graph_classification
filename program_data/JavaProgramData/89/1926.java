package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  int f;
		  int[] g = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < a;i++)
		  {
		  g[i] = 1;
		  }
		  for (i = 0;i < 100000;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  b = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  c = Integer.parseInt(tempVar3);
			  }
			  if (b == 0 && c == 0)
			  {
			  break;
			  }
			  g[b] = -a;
			  g[c]++;
		  }
		  d = 0;
		  for (i = 0;i < a;i++)
		  {
			  if (g[i] == a)
			  {
						  System.out.printf("%d",i);
						  d++;

			  }
		  }
		  if (d == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();

	}

}

