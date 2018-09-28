package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n, tangible.RefObject<Integer> p)
	{
		int k = 1;
		int i;
		int temp;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
		for (i = 0;i <= 4;i++)
		{
			temp = (p.argValue + n * 5 + i);
		   *(p.argValue + n * 5 + i) = *(p.argValue + m * 5 + i);
		   *(p.argValue + m * 5 + i) = temp;
		}
		}
		else
		{
			k = 0;
		}

	return k;
	}
	public static void Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int k;
	int m;
	int n;
	for (i = 0;i <= 4;i++)
	{
	  for (j = 0;j <= 4;j++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i][j] = Integer.parseInt(tempVar);
	  }
	  }
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	  k = f(m, n, a[0]);
	  if (k == 0)
	  {
		  System.out.print("error\n");
	  }
	  else
	  {
	  for (i = 0;i <= 4;i++)
	  {
		for (j = 0;j <= 3;j++)
		{
	  System.out.printf("%d ",*(a[0] + i * 5 + j));
		}
	System.out.printf("%d\n",*(a[0] + i * 5 + 4));
	  }
	  }

	}
}

