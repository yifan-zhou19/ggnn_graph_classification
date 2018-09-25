package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[20];
	int n;
	int m;
	int i;
	int j;
	int s;
	int s0;
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
		  m = Integer.parseInt(tempVar2);
	  }
	  for (j = 0;j < m;j++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[j] = Integer.parseInt(tempVar3);
		  }
	  }
	  s = 60;
	  s0 = 60;
	  for (j = 0;j < m;j++)
	  {
			s0 -= 3;
		  if (s0 - a[j] > 0)
		  {
		  s -= 3;
		  }
		  if (s0 - a[j] >= -3 && s0 - a[j] <= 0)
		  {
		  s -= 3 + s0 - a[j];
		  }
	  }
	  System.out.printf("%d\n",s);
	}
	return 0;
	}
}

