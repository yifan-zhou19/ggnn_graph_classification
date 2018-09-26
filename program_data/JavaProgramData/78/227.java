public class student
{
		public int weigh;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		student zhao = new student();
		student qian = new student();
		student sun = new student();
		student li = new student();
		zhao.weigh = a;
		qian.weigh = b;
		sun.weigh = c;
		li.weigh = d;
		for (a = 10;a <= 50;a = a + 10)
		{
			for (b = 10;b <= 50;b = b + 10)
			{
				for (c = 10;c <= 50;c = c + 10)
				{
					for (d = 10;d <= 50;d = d + 10)
					{
						if (a != b && a != c && a != d && b != c && b != d && c != d)
						{
							if (a + d > c + b)
							{
								if (a + c < b)
								{
									if ((a + b) == (c + d))
									{
										System.out.printf("l %d\nq %d\nz %d\ns %d",d,b,a,c);
										System.out.print("\n");
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
