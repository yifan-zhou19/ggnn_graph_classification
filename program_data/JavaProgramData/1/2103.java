package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
	if (a < min)
	{
	return 0;
	}
	int result = 1;
	for (int i = min;i < a;i++)
	{
	if (a % i == 0)
	{
	result += f(a / i, i);
	}
	}
	return result;
	}

	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int a;
		  int b;
		  for (i = 0;i < n;i++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				int min = 2;
				b = f(a, 2);
				System.out.printf("%d",b);
				System.out.print("\n");
		  }
	}

}

