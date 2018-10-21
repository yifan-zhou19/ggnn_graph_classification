package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int n;
	public static int Main()
	{
		int F = int x;
	  int i;
	  int z = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  if (z < F(i))
	  {
		  z = F(i);
	  }
	  }
	  System.out.printf("%d\n",z);

	}
	public static int F(int x)
	{
		int i;
		int z = 1;
		for (i = x + 1;i < n;i++)
		{
		if ((a[x] >= a[i]) && (F(i) + 1 > z))
		{
		z = F(i) + 1;
		}
		}
		return z;
	}

}

