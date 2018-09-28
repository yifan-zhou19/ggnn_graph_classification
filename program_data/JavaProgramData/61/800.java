package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int a;
		int b;
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
			  k = Integer.parseInt(tempVar2);
		  }
		  if (k == 1 || k == 2)
		  {
			System.out.print("1\n");
			continue;
		  }
			else
			{
			  a = 1;
			  b = 1;
			for (j = 3;j <= k;j++)
			{
			   s = a + b;
			   a = b;
			   b = s;
			}
			   System.out.printf("%d\n",s);
			}
		}
			   System.in.read();
			   System.in.read();
	}
}

