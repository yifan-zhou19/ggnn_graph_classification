package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k;
		int j;
		int t;
		int r;
		int s;
		int u;
		int Num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		if (a == 1)
		{
			i = a + 1;
		}
		else
		{
			i = a;
		}
		while (i <= b)
		{
				   k = (int)Math.sqrt(i);
				   for (j = 2;j <= k;j++)
				   {
								   if (i % j == 0)
								   {
								   break;
								   }
				   }
				   if (j > k)
				   {
						  int[] c = new int[10000];
						  t = i;
						  r = 0;
						  while (t != 0)
						  {
									 c[r] = t % 10;
									 t = t / 10;
									 r++;
						  }
						  s = 0;
						  for (u = 0;u < r;u++)
						  {
						  s = s * 10 + c[u];
						  }
						  if (s == i && Num != 0)
						  {
								  System.out.printf(",%d",i);
								  Num++;
						  }
						  if (s == i && Num == 0)
						  {
								  System.out.printf("%d",i);
								  Num++;
						  }
				   }
				   i++;
		}
		if (Num == 0)
		{
		System.out.print("no\n");
		}
	}
}

