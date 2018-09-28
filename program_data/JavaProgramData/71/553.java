package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k = 0;
		  int n;
		  int m;
		  int a;
		  int b;
		  int c;
		  int[] pm = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int[] rm = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
	k = 0;
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
						   String tempVar4 = ConsoleInput.scanfRead(" ");
						   if (tempVar4 != null)
						   {
							   c = Integer.parseInt(tempVar4);
						   }
						   if (c < b)
						   {
								  m = c;
								  c = b;
								  b = m;
						   }

						   if ((a % 4 == 0 && a % 100 != 0) || (a % 4 == 0 && a % 400 == 0))
						   {
											for (j = b;j < c;j++)
											{
											k = k + rm[j];
											}
											if (k % 7 == 0)
											{
											System.out.print("YES\n");
											}
											else
											{
											System.out.print("NO\n");
											}

						   }

						   if (a % 4 != 0 || (a % 4 == 0 && a % 100 == 0 && a % 400 != 0))
						   {
								 for (j = b;j < c;j++)
								 {
								 k = k + pm[j];
								 }
								 if (k % 7 == 0)
								 {
											System.out.print("YES\n");
								 }
											else
											{
											System.out.print("NO\n");
											}

						   }

		  }

	}

}

