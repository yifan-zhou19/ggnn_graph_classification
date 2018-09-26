package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][1000];
		int[] b = new int[100];
		char[][] c = new char[100][1000];
		int q;
		int w;
		int e;
		q = 0;
		w = 0;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 int y;
						 char[][] x = new char[100][1000];
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 x = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 y = Integer.parseInt(tempVar3);
						 }
						 if (y >= 60)
						 {
								  a[q] = x[0];
								  b[q] = y;
								  q++;
						 }
						 else
						 {
								  c[w] = x[0];
								  w++;
						 }
		}
		int h;
		char[][] H = new char[100][1000];
		for (i = 1;i < 10000;i++)
		{
			  for (j = 0;j < q;j++)
			  {
								if (b[j] < b[j + 1])
								{
										 h = b[j];
										 b[j] = b[j + 1];
										 b[j + 1] = h;
										 H[0] = a[j];
										 a[j] = a[j + 1];
										 a[j + 1] = H[0];
								}
			  }
		}
		for (i = 0;i < q;i++)
		{

						  System.out.printf("%s\n",a[i]);

		}
		for (i = 0;i < w;i++)
		{
		System.out.printf("%s\n",c[i]);
		}
	}
}

