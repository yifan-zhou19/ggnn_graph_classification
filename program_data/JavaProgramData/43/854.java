package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int i = 2;i <= m / 2;i++) //??i?????
		{
			if (i % 2 == 1)
			{
			   int l = 0;
			   for (int k = 2;k <= Math.floor(Math.sqrt(i));k++) //??i?????
			   {
				   if (i % k == 0)
				   {
					   l = l + 1;
				   }
			   }
			   if (l == 0)
			   {
			   int h = 0;
					 a = m - i; //?i????m?????a????
				   for (int b = 2;b <= Math.floor(Math.sqrt(a));b++) //??a?????
				   {
					  if (a % b == 0)
					  {
						  h = h + 1;
					  }
				   }
				  if (h == 0)
				  {
					  System.out.print(i);
					  System.out.print(" ");
					  System.out.print(a);
					  System.out.print("\n");
				  }
			   }
			}
		}
		  return 0;
	}

}

