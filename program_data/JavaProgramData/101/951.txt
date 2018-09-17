package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //a,b,c???,a1,b1,c1?????p???,?????1
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		int p = 0;
		int i = 3;
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				for (c = 1;c < 4;c++)
				{
					a1 = (b > a) + (c == a);
					b1 = (a > b) + (a > c);
					c1 = (c > b) + (b > a); //??a,b,c????
					if ((a1 - b1) * (a - b) < 0 && (a1 - c1) * (a - c) < 0 && (b1 - c1) * (b - c) < 0)
					{
						p = 1;
						break;
					} //????p?1?????
				}
				if (p == 1)
				{
					break;
				}
			} //????p?1?????
			if (p == 1)
			{
				break;
			}
		} //????p?1?????
		for (i = 1;i < 4;i++)
		{
			if (a == i)
			{
				System.out.print("A");
			}
			if (b == i)
			{
				System.out.print("B");
			}
			if (c == i)
			{
				System.out.print("C");
			}
		}
		return 0;
	}
}
