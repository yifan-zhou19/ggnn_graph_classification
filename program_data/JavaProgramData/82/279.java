package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int[] c = new int[100];
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c[0] = 0;
		d = 0;
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b = Integer.parseInt(tempVar3);
						  }
						  if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
						  {
														  c[i] = c[i - 1] + 1;
						  }
						  else
						  {
							   c[i] = 0;
						  }
						  if (c[i] > d)
						  {
										  d = c[i];
						  }
		}
		System.out.printf("%d",d);
		return 0;
	}
}

