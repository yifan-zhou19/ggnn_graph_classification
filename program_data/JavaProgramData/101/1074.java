package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		int b = 1;
		int c = 1;
		while (a <= 3)
		{
			b = 1;
			while (b <= 3)
			{
				c = 1;
				while (c <= 3)
				{
					if ((a != b) && (b != c) && (c != a))
					{
						if ((a > b) && (b > c)) //??????a>b>c,????????a>b?????1?c??????
						{
							if ((!(b > a) && !(c == a)) + ((a > b) && !(a > c)) + ((c > b) && (b > a)) == 3)
							{
								System.out.print("CBA");
							}
							else if ((!(b > a) && !(c == a)) + (!(a > b) && (a > c)) + ((c > b) && (b > a)) == 3)
							{
								System.out.print("CBA");
							}

						}
						else if ((a > c) && (c > b))
						{
							if ((!(b > a) && !(c == a)) + ((a > b) && (a > c)) + ((c > b) && !(b > a)) == 3)
							{
								System.out.print("BCA");
							}
							else if ((!(b > a) && !(c == a)) + ((a > b) && (a > c)) + (!(c > b) && (b > a)) == 3)
							{
								System.out.print("BCA");
							}
						}
						else if ((b > a) && (a > c))
						{
							if (((b > a) && !(c == a)) + (!(a > b) && !(a > c)) + ((c > b) && (b > a)) == 3)
							{
								System.out.print("CAB");
							}
							else if ((!(b > a) && (c == a)) + (!(a > b) && !(a > c)) + ((c > b) && (b > a)) == 3)
							{
								System.out.print("CAB");
							}
						}
						else if ((b > c) && (c > a))
						{
							if (((b > a) && (c == a)) + (!(a > b) && !(a > c)) + ((c > b) && !(b > a)) == 3)
							{
								System.out.print("ACB");
							}
							else if (((b > a) && (c == a)) + (!(a > b) && !(a > c)) + (!(c > b) && (b > a)) == 3)
							{
								System.out.print("ACB");
							}
						}
						else if ((c > a) && (a > b))
						{
							if (((b > a) && !(c == a)) + ((a > b) && (a > c)) + (!(c > b) && !(b > a)) == 3)
							{
								System.out.print("BAC");
							}
							else if ((!(b > a) && (c == a)) + ((a > b) && (a > c)) + (!(c > b) && !(b > a)) == 3)
							{
								System.out.print("BAC");
							}
						}
						else if ((c > b) && (b > a))
						{
							if (((b > a) && (c == a)) + ((a > b) && !(a > c)) + (!(c > b) && !(b > a)) == 3)
							{
								System.out.print("ABC");
							}
							else if (((b > a) && (c == a)) + (!(a > b) && (a > c)) + (!(c > b) && !(b > a)) == 3)
							{
								System.out.print("ABC");
							}
						}

					}
					c = c + 1;
				}
				b = b + 1;
			}
			a = a + 1;
		}
		return 0;
	}

}
