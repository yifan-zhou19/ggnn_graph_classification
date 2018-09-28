package <missing>;

public class GlobalMembers
{
	//??,????????,???!


	public static int Main()
	{
		  int m;
		  int n;
		  int c;
		  int b;
		  int x;
		  int p;
		  int q;
		  int u;
		  int shuliang = 0;
		  int dayin;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (int i = m;i <= n;i++)
		  {
				  float o;
				  o = (float)i;
				  c = (int)Math.sqrt(o);
				  int d = 0;
				  int e = 1;
				  for (int k = 2;k <= c;k++) //???????
				  {
						  if (i % k == 0)
						  {
						  d++;
						  }
				  }


				  if (d == 0)
				  {
						  e = 0;
						  x = 1;
						  dayin = i;
						  for (;dayin != 0;)
						  {
									e++;
									dayin = dayin / 10;
						  }


						  if (e % 2 == 0)
						  {
								  for (int l = 1;l <= e / 2;l++)
								  {
								  x = x * 10;
								  }
							p = i % x;
							q = i / x;

							int[] g = new int[e / 2 + 1];
							int[] h = new int[e / 2 + 1];
							int u = 1;
							for (int l = 1;l <= (e-1) / 2;l++)
							{
							g[l] = 0;
							}
							for (int l = 1;l <= e / 2;l++)
							{
								  u = u * 10;
								  g[l] = p % u;
								  h[l] = q % u;
							}

							b = 0;
							for (int l = 1;l <= e / 2;l++)
							{
								  if (g[l] != h[e / 2 + 1 - l])
								  {
								  b++;
								  }
							}
						  }


						  if (e % 2 != 0)
						  {
								  for (int l = 1;l <= (e-1) / 2;l++)
								  {
								  x = x * 10;
								  }
							p = i % x;
							q = i / (x * 10);

							int[] g = new int[100];
							int[] h = new int[100];
							for (int l = 1;l <= (e-1) / 2;l++)
							{
							g[l] = 0;
							}

							u = 10;

							for (int l = 1;l <= (e-1) / 2;l++)
							{

								  g[l] = p % u;
								  p = p / 10;
								  h[l] = q % u;
								  q = q / 10;
							}
							b = 0;

							for (int l = 1;l <= (e-1) / 2;l++)
							{
								  if (g[l] != h[((e-1) / 2 - l + 1)])
								  {
								  b++;
								  }
							}
						  }



						  if (b == 0)
						  {
								  shuliang++;
								  if (shuliang == 1)
								  {
								  System.out.printf("%d",i);
								  }
								  else
								  {
								  System.out.printf(",%d",i);
								  }
						  }


				  }
		  }
		  if (shuliang == 0)
		  {
		  System.out.print("no");
		  }
		  System.in.read();
		  System.in.read();

	}

}

