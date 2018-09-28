package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] x = new int[10000];
	int[] y = new int[10000];
	int i;
	int j;
	int n;
	int b;
	int c;
	int a;
	int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;1;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  x[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  y[i] = Integer.parseInt(tempVar3);
	  }
	  if (x[i] == 0 && y[i] == 0)
	  {
		  k = i;
		  break;
	  }
	}
	a = 0;
	for (i = 0;i < n;i++)
	{
	b = 0;
	c = 0;

	 for (j = 0;j < k;j++)
	 {
			if (i == y[j])
			{
			b++;
			}
			if (i == x[j])
			{
			 c++;
			}
	 }

	 if (b == (n - 1) && c == 0)
	 {
		 System.out.printf("%d\n",i);
		 a++;
	 }

	}
	if (a == 0)
	{
		System.out.print("NOT FOUND\n");
	}


	return 0;
	}

}

