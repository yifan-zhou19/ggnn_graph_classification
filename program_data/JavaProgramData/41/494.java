package <missing>;

public class GlobalMembers
{
	public static int judge(int a,int b,int c,int d,int e)
	{
	   if (a != b & a != c && a != d && a != e)
	   {
		 if (b != c && b != d && b != e)
		 {
		   if (c != d && c != e)
		   {
			 if (d != e)
			 {
			  return 1;
			 }
		   }
		 }
	   }
	   return 0;
	}
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int cor = 0;
	   int i;
	   int time = 0;
	   int[] re = new int[5];
	   int[] p = new int[5];
	   for (a = 1;a <= 5;a++)
	   {
		 for (b = 2;b <= 2;b++)
		 {
		   for (c = 1;c <= 5;c++)
		   {
			 for (d = 1;d <= 5;d++)
			 {
			   for (e = 1;e <= 5;e++)
			   {
				   if (judge(a, b, c, d, e) != 0)
				   {
					re[0] = 0;
					re[1] = 0;
					re[2] = 0;
					re[3] = 0;
					re[4] = 0;
					cor = 0;
					 if (e == 1)
					 {
						 re[0]++;
					 }
					 if (b == 2)
					 {
						 re[1]++;
					 }

					 if (a == 5)
					 {
						 re[2]++;
					 }

					if (c != 1)
					{
						re[3]++;
					}

					if (d == 1)
					{
						re[4]++;
					}
					//if (cor==2)
					//if (a-re[0]<=2&&b-re[1]<=2&&c-re[2]<=2&&d-re[3]<=2&&e-re[4]<=2)
					p[0] = a;
					p[1] = b;
					p[2] = c;
					p[3] = d;
					p[4] = e;
					for (i = 0;i < 5;i++)
					{
					  if ((re[i] == 1 && p[i] == 1) || (re[i] == 1 && p[i] == 2))
					  {
						cor++;
					  }
					  else
					  {
						 if (re[i] == 1 && p[i] != 1 && p[i] != 2)
						 {
							 cor--;
						 }
					  }
					}
					//printf("%d\n",cor);
					if (cor == 2 && time == 0)
					{
						System.out.printf("%d %d %d %d %d\n",a,b,c,d,e);
						time++;
					}
				   }
			   }
			 }
		   }
		 }
	   }
	}

}
