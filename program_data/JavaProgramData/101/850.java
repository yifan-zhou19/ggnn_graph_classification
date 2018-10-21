package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++) //????
		{
			   for (b = 1;b <= 3;b++)
			   {
					  for (c = 1;c <= 3;c++)
					  {
							  if ((a + (b > a) + (c == a)) == (b + (a > b) + (a > c)) && (b + (a > b) + (a > c)) == (c + (c > b) + (b > a))) //????????
							  {
									 int[] num = {a, b, c}; //?????
									int mid;
									int j;
									int i;
									for (j = 1;j <= 2;j++)
									{
										   for (i = 0;i <= 1;i++)
										   {
												 if (num[i] > num[i + 1])
												 {
													 mid = num[i];
													num[i] = num[i + 1];
													num[i + 1] = mid;
												 }
										   }
									}
									if (num[0] == a)
									{
										System.out.print("A");
									}
									if (num[0] == b)
									{
										System.out.print("B");
									}
									if (num[0] == c)
									{
										System.out.print("C");
									}
									if (num[1] == a)
									{
										System.out.print("A");
									}
									if (num[1] == b)
									{
										System.out.print("B");
									}
									if (num[1] == c)
									{
										System.out.print("C");
									}
									if (num[2] == a)
									{
										System.out.print("A");
									}
									if (num[2] == b)
									{
										System.out.print("B");
									}
									if (num[2] == c)
									{
										System.out.print("C");
									}
							  }
					  }
			   }
		}

		return 0;
	}
}
