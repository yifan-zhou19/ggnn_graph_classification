package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int n;
	  int i;
	  int d;
	  int j;
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
			d = Integer.parseInt(tempVar2);
		}
		a = 1;
		b = 1;
		if (d < 3)
		{
			System.out.print("1\n");
			break;
		}
		for (j = 3;j <= d;j++)
		{
		  c = a + b;
		  a = b;
		  b = c;
		}
		System.out.printf("%d\n",c);
	  }
	  return 0;
	}

}

