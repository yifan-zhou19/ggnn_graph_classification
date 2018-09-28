package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int t;
		  int count = 0;
		  int r;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] b = new int[10000];
		  int[] c = new int[10000];
		  for (t = 1;;t++)
		  {
				int i;
				int j;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				if (i == 0 && j == 0)
				{
					break;
				}
				else
				{
					b[i]++;
					c[j]++;
				}
		  }
		  for (r = 0;r < n;r++)
		  {
				if (b[r] == 0 && c[r] == n - 1)
				{
					System.out.printf("%d\n",r);
					count++;
				}
		  }
		  if (count == 0)
		  {
			   System.out.print("NOT FOUND");
		  }
	}

}

