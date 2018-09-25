package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int a;
		int p;
		int q;
		int k;
		int sum = 0;
		int b = 0;
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
				 m = Integer.parseInt(tempVar2);
			 }
			 if (m == 0)
			 {
				 System.out.printf("60\n",a);
			 }
			 else if (m > 0)
			 {
			 for (j = 1;j <= m;j++)
			 {
							  String tempVar3 = ConsoleInput.scanfRead();
							  if (tempVar3 != null)
							  {
								  a = Integer.parseInt(tempVar3);
							  }
							  q = a + 3 * j;
							  if (q < 63)
							  {
								  sum = q;
							 k = a;
							  b = j;
							  }
			 }
							  if (sum >= 60 && sum <= 62)
							  {
								 System.out.printf("%d\n",k);

							  }
							 else if (sum < 60 && q>62)
							 {
							 p = 60 - 3 * b;
							 System.out.printf("%d\n",p);


							 }




							if (q < 60)
							{
								  sum = 60 - 3 * m;
								   System.out.printf("%d\n",sum);
							}

			 }
		}
		   scanf("%D", a);

	}

}

