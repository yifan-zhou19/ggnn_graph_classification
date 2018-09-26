package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a = 3;
	  int b;
	  int c;
	  int n;
	  int[] f = new int[10000];
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;a <= n;a = a + 2)
	  {
		for (c = 2;c < a;c = c + 1)
		{
			b = a % c;
			if (b == 0)
			{
				break;
			}
		}
		if (c == a)
		{
		  f[i] = a;
		  i++;
		}
	  }
	  for (j = 0;j <= i;j++)
	  {
		if (f[j + 1] - f[j] == 2)
		{
		System.out.printf("%d %d\n",f[j],f[j + 1]);
		}
	  }
	if (n < 5)
	{
	  System.out.print("empty");
	}
	}

}

