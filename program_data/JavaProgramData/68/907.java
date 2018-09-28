package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int s = 0;
		int h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int i = 6; i <= n;i = i + 2) //?????????
		{
		   for (int j = 3;j <= (i / 2);j = j + 2)
		   {
			   h = 0;
			   m = 0;
			   s = 0; //????????
			   for (int k = 1;k <= Math.floor(Math.sqrt(j));k = k + 2)
			   {
			 if (j % k == 0)
			 {
				 m = m + 1; //??j?????
			 }
			   }
			   if (m == 1)
			   {
				 for (int l = 1;l <= Math.floor(Math.sqrt(i - j));l = l + 2)
				 {
				  if ((i - j) % l == 0)
				  {
					  s = s + 1; //??i-j?????
				  }
				 }
				 if (s == 1)
				 {
				  System.out.print(i);
				  System.out.print("=");
				  System.out.print(j);
				  System.out.print("+");
				  System.out.print(i - j);
				  System.out.print("\n");
				  h = h + 1;
				 }
			   }
			   if (h == 1)
			   {
				   break; //??????????????????
			   }
		   }
		}
		return 0;
	}


}

