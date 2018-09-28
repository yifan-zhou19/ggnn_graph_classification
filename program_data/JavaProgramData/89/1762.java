package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  int a;
		  int b;
		  int c;
		  int[] s = new int[10000];
		  int[] d = new int[10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  s[i] = 0;
			  d[i] = 0;
		  }
			a = 1;
			b = 1;
		  while ((a + b) != 0)
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
			s[b] = s[b] + a;
			if (a == 0)
			{
			d[b] = 1;
			}
		  }

		  c = 0;
		  if (s[0] == n * (n - 1) / 2)
		  {
			  System.out.print("0\n");
			  c = 1;
		  }
		  for (i = 1;i < n;i++)
		  {
			if (((s[i] + i) == n * (n - 1) / 2) && d[i] == 1)
			{
			  System.out.printf("%d\n",i);
			  c = 1;
			}
		  }
		  if (c == 0)
		  {
			System.out.print("NOT FOUND");
		  }
	}
}

