package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[100];
		  int m;
		  int i;
		  int k;
		  float n;
		  float a1;
		  float a2;
		  float a3;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  i = 0;
		  while (i < m)
		  {
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					i = i + 1;
		  }
		  i = 0;
		  while (i < m)
		  {
					a1 = 1F;
					a2 = 2F;
					n = 0F;
					k = 1;
					while (k <= a[i])
					{
						n = a2 / a1 + n;
						a3 = a2;
						a2 = a1 + a2;
						a1 = a3;
						k = k + 1;
					}
						System.out.printf("%.3f\n",n);
						i = i + 1;
		  }
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
						System.in.read();
	}
}

