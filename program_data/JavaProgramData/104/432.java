package <missing>;

public class GlobalMembers
{
	/**
	 *???4.cpp
	 *??????
	 *??????
	 *???11?26
	 */
	public static void route(int n, int[] a, int[] c) //???????????????????????????
	{
		  c[0] = 0;
		  if (n == 1)
		  {
			  a[0] = 1;
		  }
		  else
		  {
			  route(n / 2, a, c);
		   c[0]++;
		   a[c[0]] = n;
		  }
	}
	public static int Main()
	{
		int x;
		int y;
		int x1;
		int[] a = new int[12];
		int[] b = new int[12];
		int[] c = new int[2];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		route(x, a, c); //??x,y????????a,b?
		route(y, b, c);
		int n1;
		int n2;
		for (n1 = 0;a[n1] != 0;n1++)
		{
			; //???????????
		}
		for (n2 = 0;b[n2] != 0;n2++)
		{
			;
		}
		int j;
		int k;
		int flag = 1;
		for (j = n1 - 1;j >= 0;j--)
		{
			 for (k = n2 - 1;k >= 0;k--)
			 {
				  if (a[j] == b[k]) //???????????????????????
				  {
					  x1 = a[j]; //??????????x1
					  flag = 0;
					  break;
				  }
			 }
			 if (flag == 0)
			 {
				 break;
			 }
			 else
			 {
				 continue;
			 }
		}
		System.out.print(x1);
		System.out.print("\n");
		return 0;
	}
}

