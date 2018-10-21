package <missing>;

public class GlobalMembers
{
	public static int so(int x)
	{
	  int i;
	  int soo = 1;
	  for (i = 1;i < 10;i++)
	  {
		  if ((x / 2) != 0)
		  {
		  x = (int)x / 2;
		  soo++;
		  }
		  else
		  {
			  break;
		  }
	  }
		  return (soo);
	}

	public static void Main()
	{
		  int a;
		  int b;
		  int i;
		  int t;
		  int w;
		  int r;
		  int n;
		  int[] c = new int[1001];
		  int[] d = new int[1001];

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


		  i = so(a);
		  t = so(b);
		  for (c[0] = a,w = 0;w < i - 1;w++)
		  {
				  if (c[w] % 2 == 0)
				  {
				 c[w + 1] = c[w] / 2;
				  }
			  else
			  {
				  c[w + 1] = (c[w] - 1) / 2;
			  }
		  }

		for (d[0] = b,r = 0;r < t - 1;r++)
		{
				 if (d[r] % 2 == 0)
				 {
				 d[r + 1] = d[r] / 2;
				 }
			  else
			  {
				  d[r + 1] = (d[r] - 1) / 2;
			  }
		}

	if (c[0] == d[0])
	{
	System.out.printf("%d",c[0]);
	}
	else
	{
	 for (n = 0;n <= t;n++)
	 {
				if (c[i - n - 1] != d[t - n - 1])
				{
					System.out.printf("%d",c[i - n]);
					break;
				}
	 }

	}
	}

}

