package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int n = 1;
		int m = 1;
		int[] a = new int[15];
		int[] b = new int[15];
		int p = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = x;
		b[0] = y;
		for (i = 1;a[i - 1] != 1;i++)
		{
			a[i] = a[i - 1] / 2;
			n++;
		} //???????
		 for (i = 1;b[i - 1] != 1;i++)
		 {
			 b[i] = b[i - 1] / 2;
			 m++;
		 }
		 if (x >= y) //??????????????
		 {
			 for (j = 0;j < m;j++)
			 {
				  for (i = 0;i < n;i++)
				  {
				  if (a[i] == b[j])
				  {
					  System.out.print(a[i]);
					  p = 1;
					  break;
				  }
				  }
			   if (p != 0)
			   {
				   break;
			   }
			 }
		 }
		 else
		 {
			 for (i = 0;i < n;i++)
			 {
				  for (j = 0;j < m;j++)
				  {
				  if (a[i] == b[j])
				  {
					  System.out.print(a[i]);
					  p = 1;
					  break;
				  }
				  }
			   if (p != 0)
			   {
				   break;
			   }
			 }
		 }
			  return 0;
	}

}

