package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int o = 0;
		for (a = 1; a <= 3 && o < 1; a++)
		{
			for (b = 1; b <= 3 && o < 1; b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1; c <= 3 && o < 1; c++)
				{
					if (a == c || b == c)
					{
						  continue;
					}
	  //              if(a == 3 && b == 1 && c == 2)
	  //                  cout<<"herererere"<<endl;
					if ((a == 3 - (b > a) - (c == a)) && (b == 3 - (a > b) - (a > c)) && (c == 3 - (c > b) - (b > a)))
					{
						o = 1;
					}
				}
			}
		} //??????????????????????????????????
		a = a - 1;
		b = b - 1;
		c = c - 1;
		//cout<<o<<endl;
		if (a > b && b > c)
		{
			System.out.print("CBA");
		}
		if (a > c && c > b)
		{
			System.out.print("BCA");
		}
		if (b > a && a > c)
		{
			System.out.print("CAB");
		}
		if (b > c && c > a)
		{
			System.out.print("ACB");
		}
		if (c > b && b > a)
		{
			System.out.print("ABC");
		}
		if (c > a && a > b)
		{
			System.out.print("BAC");
		}

		return 0;
	}

}
