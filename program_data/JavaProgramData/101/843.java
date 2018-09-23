package <missing>;

public class GlobalMembers
{
	/*
	Name:???
	ID:1200012842
	Email:443972553@qq.com
	*/
	public static int Main()
	{
		int a; //A,B,C???,?{1,2,3}
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					if (a != b)
					{
					   if (a != c)
					   {
						  if (b != c)
						  {
							 if ((b > a) + a == 3)
							 {
								if ((a > b) + (a > c) + b == 3)
								{
								   if ((c > b) + (b > a) + c == 3)
								   {
									  for (int i = 1;i <= 3;i++)
									  {
										  if (a == i)
										  {
											  System.out.print('A');
										  }
										  if (b == i)
										  {
											  System.out.print('B');
										  }
										  if (c == i)
										  {
											  System.out.print('C');
										  }
									  }
								   }
								}
							 }
						  }
					   }
					}
				}
			}
		}
		return 0;
	}

}
