package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] a = new int[50000];
	 int[] b = new int[50000];
	 int i;
	 int j;
	 int t1;
	 int t2;
	 int c;
	 int d;
	 int k;
	 char e = 'x';
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 d = 0;
	 i = 0;
	 while (i < n)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  i = i + 1;
	 }
	 for (j = 0;j < n - 1;j = j + 1)
	 {
						   for (i = 0;i < n - 1 - j;i = i + 1)
						   {
												if (a[i] > a[i + 1])
												{
																t1 = a[i];
																t2 = b[i];
																a[i] = a[i + 1];
																b[i] = b[i + 1];
																a[i + 1] = t1;
																b[i + 1] = t2;
												}
						   }
	 }
		i = 0;
		while (i < n - 1)
		{
				   if (b[i] < a[i + 1])
				   {
								   e = 'y';
								   break;
				   }
				   else if (b[i] > b[i + 1])
				   {
						b[i + 1] = b[i];
				   }
				   i = i + 1;
		}
		if (e == 'y')
		{
							System.out.print("no");
		}
		if (e == 'x')
		{
		 System.out.printf("%d %d",a[0],b[n - 1]);
		}
	 return 0;
	}
}

