package <missing>;

public class GlobalMembers
{
	//**************************
	//* author ??           **
	//* date 2012.10.24       **
	//* description ???    **
	//**************************

	public static int Main()
	{
		//cout << "?????????n" << endl;
		int n; //n????????a,b,c???,y??????x??????
		int a;
		int b;
		int c;
		int y;
		int x;
		int z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) //n???
		{
			x = 0;
			y = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b > c) //?b??c
			{
				z = c;
				c = b;
				b = z;
			}
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) //????
			{
				y = 1;
			}
			for (; b <= c - 1; b++) //??????
			{
				switch (b)
				{
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					x = x + 31;
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					x = x + 30;
					break;
				case 2 :
					x = x + 28 + y;
					break;
				}
			}
			if (x % 7 == 0) //??????????
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}

		return 0;
	}




}

