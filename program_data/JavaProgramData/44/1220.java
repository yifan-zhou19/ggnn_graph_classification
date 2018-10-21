package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int[] a = new int[5];
		int[] b = {10000, 1000, 100, 10, 1};
		int i;
		int j;
		int sum = 0;
		if (x == 0)
		{
		return 0;
		}
		else if (x == -0)
		{
		return 0;
		}
		else if (x > 0)
		{
			int m = x;
			for (i = 0;i < 5;i++)
			{
				a[i] = m / b[i];
				m = x % b[i];
			}
			for (i = 0;i < 5;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			for (j = i;j < 5;j++)
			{
				sum = sum + a[j] * b[4 + i - j];
			}
			return sum;
		}
		else
		{
			int y = -x;
			for (i = 0;i < 5;i++)
			{
				a[i] = y / b[i];
				y = y % b[i];
			}
			for (i = 0;i < 5;i++)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			for (j = i;j < 5;j++)
			{
				sum = sum + a[j] * b[4 + i - j];
			}
			sum = -sum;
			return sum;
		}
	}
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  int g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead("\n");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead("\n");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead("\n");
		  if (tempVar4 != null)
		  {
			  d = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead("\n");
		  if (tempVar5 != null)
		  {
			  e = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead("\n");
		  if (tempVar6 != null)
		  {
			  g = Integer.parseInt(tempVar6);
		  }
		  a = f(a);
		  b = f(b);
		  c = f(c);
		  d = f(d);
		  e = f(e);
		  g = f(g);
		  System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,g);
		  System.in.read();
		  System.in.read();
	}

}

