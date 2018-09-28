package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int d;
		 int e;
		 int f;
		 int g;
		 int i;
		 int j;
		 int k;
		 int l;
		 int m;
		 int n;
		 int x;
		 int y;
		 int[] a = new int[10000];
		 int[] b = new int[10000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 d = Integer.parseInt(tempVar);
		 }
	x = y = 1;
	a[0] = b[0] = -1;
		while (x + y != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			a[x]++;
			b[y]++;
		}

		 for (j = 0,m = 1,n = 0;j < d;j++)
		 {
				if (b[j] == d - 1 && a[j] == 0)
				{
						  l = j;
				 n = 1;

				}


		 }
		 if (n == 1)
		 {
		   System.out.printf("%d",l);
		 }
		   else
		   {
			System.out.print("NOT FOUND");
		   }


	}

}

