package <missing>;

public class GlobalMembers
{
	//*****************************************
	//*         ???????13              *
	//*         ??????                  *
	//*         ???1200012764              *
	//*         ???2012/11/18              * 
	//*****************************************
	public static int Main()
	{
		String a = new String(new char[150]); //????????????a
		int[] b = new int[150]; //???????b???????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int u; //????????????u?v?w?   ???????al
		int v;
		int w;
		int al;
		al = a.length();
		int x = 0;
		int y = 0;
		if (al >= 3) //???????????
		{
		if (x >= 13) //?????????13????al - 1?
		{
			x = 10 * (a.charAt(0) - '0') + a.charAt(1) - '0';
			u = 0;
			while (u <= al - 3) //???????????????????
			{
				b[u] = x / 13;
				x = (x % 13) * 10 + (a.charAt(u + 2) - '0');
				u++;
			}
			b[al - 2] = x / 13; //?????????
			y = x % 13; //y???
			for (u = 0; u <= al - 2; u++)
			{
				System.out.print(b[u]);
			}
			System.out.print("\n");
			System.out.print(y);
			System.out.print("\n");
		}
		if (x < 13) //??????13?????al-3?
		{
			x = 100 * (a.charAt(0) - '0') + 10 * (a.charAt(1) - '0') + a.charAt(2) - '0';
			u = 0;
			while (u <= al - 4) //?????????????
			{
				b[u] = x / 13;
				x = (x % 13) * 10 + (a.charAt(u + 3) - '0');
				u++;
			}
			b[al - 3] = x / 13;
			y = x % 13;
			for (u = 0; u <= al - 3; u++)
			{
				System.out.print(b[u]);
			}
			System.out.print("\n");
			System.out.print(y);
			System.out.print("\n");
		}
		}
		if (al == 1) //????????????
		{

			System.out.print("0");
			System.out.print("\n");
			System.out.print(a.charAt(0) - '0');
			System.out.print("\n");
		}
		if (al == 2) //????????????
		{
			x = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0'; //?????????
			System.out.print(x / 13);
			System.out.print("\n");
			System.out.print(x % 13);
			System.out.print("\n");
		}
		return 0;
	}


}

