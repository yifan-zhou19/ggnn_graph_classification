package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a = 1;
		  int b = 1;
		  int[] c = new int[10000];
		  int i;
		  int t;
		  int y = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  c[i] = n;
		  }
		  while (a != 0 || b != 0)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  if (a == 0 && b == 0)
			  {
				  break;
			  }
			  else
			  {
			  c[a] = 0;
			  if (c[b] != 0)
			  {
				  c[b]++;
			  }
			  }
		  }

		  for (i = 0;i < n;i++)
		  {
			  if (c[i] == 2 * n - 1)
			  {
				t = i;
				y = 1;
				break;
			  }
		  }
				if (y != 0)
				{
					System.out.printf("%d\n",t);
				}
				else
				{
					System.out.print("NOT FOUND\n");
				}
	}
}

