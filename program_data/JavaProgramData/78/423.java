package <missing>;

public class GlobalMembers
{
	public static char[] Name = {' ', 'z', 'q', 's', 'l'};
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int[] Res = new int[5];
		int m1;
		int m2;
		int m3;
		int m4;
		for (a = 10;a <= 50;a = a + 10) //?????????????
		{
		   for (b = 10;b <= 50;b = b + 10)
		   {
				 for (c = 10;c <= 50;c = c + 10)
				 {
				  for (d = 10;d <= 50;d = d + 10)
				  {
						if (a + b == c + d && a + d > b + c && a + c < b) //???????????
						{
							Res[1] = a; //?Res???????????
							Res[2] = b;
							Res[3] = c;
							Res[4] = d;
						}
				  }
				 }
		   }
		}
		//???4??????????????????
		int m = 0; //m???????????mNum??m????????
		int mNum = 0;
		for (int x = 1;x <= 4;x++)
		{
			if (m < Res[x])
			{
				m = Res[x];
				mNum = x;
			}
		}
		System.out.print(Name[mNum]);
		System.out.print(' ');
		System.out.print(Res[mNum]);
		System.out.print("\n");
		Res[mNum] = 0;
		m = 0;
		for (int x = 1;x <= 4;x++)
		{
			if (m < Res[x])
			{
				m = Res[x];
				mNum = x;
			}
		}
		System.out.print(Name[mNum]);
		System.out.print(' ');
		System.out.print(Res[mNum]);
		System.out.print("\n");
		Res[mNum] = 0;
		m = 0;
		for (int x = 1;x <= 4;x++)
		{
			if (m < Res[x])
			{
				m = Res[x];
				mNum = x;
			}
		}
		System.out.print(Name[mNum]);
		System.out.print(' ');
		System.out.print(Res[mNum]);
		System.out.print("\n");
		Res[mNum] = 0;
		m = 0;
		for (int x = 1;x <= 4;x++)
		{
			if (m < Res[x])
			{
				m = Res[x];
				mNum = x;
			}
		}
		System.out.print(Name[mNum]);
		System.out.print(' ');
		System.out.print(Res[mNum]);
		System.out.print("\n");

		return 0;
	}

}
