package <missing>;

public class GlobalMembers
{
	public static int ppow(char p,int q)
	{
		int x;
		int y;
		y = (int)(p - 48);
	   for (x = 1;x <= q;x++)
	   {
		 y = y * 10;
	   }
		 return y;
	}

	public static int Main()
	{
		String aa = new String(new char[5000]);
		String bb = new String(new char[5000]);
		char s;
		aa = new Scanner(System.in).nextLine();
		bb = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int l;
		int a;
		int m;
		int n;
		while (aa.charAt(i) != '\0')
		{
		  if (aa.charAt(i) == ',')
		  {
		  j++;
		  }
		  i++;
		}
		  j++;
		  int[][] cc = new int[j + 1][2];
		  int[] dd = new int[1000];
		  int i1;
		  int k1;
		  int i2;
		  int k2;
			 for (i = 1;i <= j;i++)
			 {
						 cc[i][0] = 0;
						 cc[i][1] = 0;
			 }
		  i1 = 0;
		  i2 = 0;
		  m = 1;
			do
			{
			 k1 = 1;
			 k2 = 1;
			 while (aa.charAt(i1 + k1) != ',' && aa.charAt(i1 + k1) != '\0')
			 {
				  k1++;
			 }
			  while (bb.charAt(i2 + k2) != ',' && bb.charAt(i2 + k2) != '\0')
			  {
				  k2++;
			  }
			   for (l = i1;l < i1 + k1;l++)
			   {
			   cc[m][0] = cc[m][0] + ppow(aa.charAt(l), k1 - l + i1 - 1);
			   }
			   for (l = i2;l < i2 + k2;l++)
			   {
			   cc[m][1] = cc[m][1] + ppow(bb.charAt(l), k2 - l + i2 - 1);
			   }
			   m++;
			   i1 = i1 + k1 + 1;
			   i2 = i2 + k2 + 1;
			}while (m != j + 1);
		for (i = 1;i <= 999;i++)
		{
			 dd[i] = 0;
		}
		for (i1 = 1;i1 <= 999;i1++)
		{
			 for (i2 = 1;i2 <= j;i2++)
			 {
				   if (i1 >= cc[i2][0] != 0 && i1 < cc[i2][1])
				   {
						dd[i1]++;
				   }
			 }
		}
			  a = dd[1];
		for (i = 2;i <= 999;i++)
		{
		  if (a < dd[i])
		  {
			a = dd[i];
		  }
		}
		  System.out.print(j);
		  System.out.print(" ");
		  System.out.print(a);
			 return 0;
	}



}
