package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		a = System.in.read();
		if (a <= 57 && a >= 48)
		{
			char b;
			b = System.in.read();
			if (b <= 57 && b >= 48)
			{
				char c;
				c = System.in.read();
				if (c <= 57 && c >= 48)
				{
					char d;
					d = System.in.read();
					if (d <= 57 && d >= 48)
					{
						char e;
						e = System.in.read();
						if (e <= 57 && e >= 48)
						{
						System.out.printf("%c%c%c%c%c",e,d,c,b,a);
						}
						else
						{
							System.out.printf("%c%c%c%c",d,c,b,a);
						}
					}
					else
					{
						System.out.printf("%c%c%c",c,b,a);
					}
				}
				else
				{
					System.out.printf("%c%c",b,a);
				}
			}
			else
			{
				System.out.printf("%c",a);
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}

}
