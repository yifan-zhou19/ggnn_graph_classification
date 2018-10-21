package <missing>;

public class GlobalMembers
{
	public static int MAX(int a,int b)
	{
		return (a > b != 0?a:b);
	}
	public static int FIRE(int[] h, int m, int i, int j)
	{
		if (i == j)
		{
			return m >= h[j];
		}
		else if (m >= h[i])
		{
			return MAX(FIRE(h, m, i + 1, j), FIRE(h, h[i], i + 1, j) + 1);
		}
		else if (m < h[i])
		{
			return FIRE(h, m, i + 1, j);
		}
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int[] h = new int[26];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  h + i = tempVar2;
		  }
		  }
		  System.out.printf("%d",FIRE(h, 65530, 1, n)); //????????65530?
	}
}

