package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int k;
	  int l = 0;
	  int[] s = new int[1000];
	  int[][] h = new int[1000][1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  h[i][j] = s[i] + s[j];
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  if (h[i][j] == k)
		  {
			l = l + 1;
		  }
		}
	  }
	  if (l > 0)
	  {
		System.out.print("yes");
	  }
	  else
	  {
		System.out.print("no");
	  }
	  return 0;
	}

}

