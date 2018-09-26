package <missing>;

public class GlobalMembers
{
	//********???????******************
	//********?????2012?10?22?********
	//********????????****************
	//********???1200062701***************



	public static int Main()
	{
		int a;
		int b;
		int c;
		int e;
		int n;
		int y;
		int d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a > b)
			{
				e = a, c = b, a = c, b = e;
			}
			for (int e = a ; e < b; e++)
			{
				if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
				{
					switch (e)
					{
						case 1 :
							d = d + 31;
							break;
						case 2 :
							d = d + 29;
							break;
						case 3 :
							d = d + 31;
							break;
						case 4 :
							d = d + 30;
							break;
						case 5 :
							d = d + 31;
							break;
						case 6 :
							d = d + 30;
							break;
						case 7 :
							d = d + 31;
							break;
						case 8 :
							d = d + 31;
							break;
						case 9 :
							d = d + 30;
							break;
						case 10 :
							d = d + 31;
							break;
						case 11 :
							d = d + 30;
							break;
					}
				}
				else
				{
					switch (e)
					{
						case 1 :
							d = d + 31;
							break;
						case 2 :
							d = d + 28;
							break;
						case 3 :
							d = d + 31;
							break;
						case 4 :
							d = d + 30;
							break;
						case 5 :
							d = d + 31;
							break;
						case 6 :
							d = d + 30;
							break;
						case 7 :
							d = d + 31;
							break;
						case 8 :
							d = d + 31;
							break;
						case 9 :
							d = d + 30;
							break;
						case 10 :
							d = d + 31;
							break;
						case 11 :
							d = d + 30;
							break;
					}
				}
			}
			if (d % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			d = 0;
		}
		return 0;
	}

}

