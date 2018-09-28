package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????**
	//*??????1200012914 **
	//*???2012.10.22 **
	//********************************

	public static int Main()
	{
		int n;
		int y;
		int mx;
		int my;
		int leap;
		int dd;
		int d = 0;
		//???????????????????leap???????2????
		int m1; //?????m1????m2
		int m2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mx = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			my = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) //????
			{
			leap = 1; //???2????
			}
			else
			{
				leap = 0; //?????
			}

			if (mx <= my)
			{
				m1 = mx;
				m2 = my;
			}
			else
			{
				m1 = my;
				m2 = mx;
			} //?mx?my?????

			while (m1 < m2)
			{
				  if (m1 == 2)
				  {
					  dd = 28 + leap;
				  }
					 else if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)
					 {
						 dd = 30;
					 }
						  else
						  {
							  dd = 31; //??m1????
						  }
				  d = d + dd; //????????????
				  m1++; //??????
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
			d = 0; //????
		}


		return 0;
	}

}

