package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int[][] n = new int[100][100];
	  int l = 0;
	  int i;
	  int j;
	  int k;
	  int h;
	  int g;
	  char m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  m = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  for (i = 0;i < a;i++)
	  {
		for (j = 0;j < b;j++)
		{
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  (n[i][j]) = Integer.parseInt(tempVar4);
		  }
		}
	  }
	  for (i = 0;i < a;i++)
	  {
		for (j = 0,h = j,g = n[i][j];j < b - 1;j++)
		{
		  if (g < n[i][j + 1])
		  {
			  g = n[i][j + 1],h = j + 1;
		  }
		}
		for (k = 0;k < a;k++)
		{
			if (g > n[k][h])
			{
				break;
			}
		}
		if (k == a)
		{
		  System.out.printf("%d+%d\n",i,h);
		  l++;
		}
	  }
	  if (l == 0)
	  {
		  System.out.print("No");
	  }
	  return 0;
	}
}

