package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*???????                               *
	//*???????                               *
	//*?????                                   *
	//*???2010.11.17                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 


	public static int Main()
	{
		int A; //    ????A,B,C?????AT,BT,CT?????????????a,b,c???
		int B;
		int C;
		int AT;
		int BT;
		int CT;
		int a;
		int b;
		int c;

		for (A = 1; A <= 3; A++)
		{
			for (B = 1; B <= 3; B++)
			{
				for (C = 1; C <= 3; C++)
				{
					AT = (B > A) + (A == C);
					BT = (A > B) + (A > C);
					CT = (C > B) + (B > A); //    ??????????
					if ((AT <= BT) && (A <= B) || (BT <= CT) && (B <= C) || (CT <= AT) && (C <= A) || (AT >= BT) && (A >= B) || (BT >= CT) && (B >= C) || (CT >= AT) && (C >= A))
					{
						continue; //    ?????????????
					}
					a = AT;
					b = BT;
					c = CT; //    ????a,b,c???

				}
			}
		}
		if (a <= b != 0 && b <= c)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		else if (a >= b != 0 && b >= c)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		else if (a <= b != 0 && c <= a)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		else if (a >= b != 0 && c >= a)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		else if (b >= c != 0 && c >= a)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		else
		{
			System.out.print("ACB");
			System.out.print("\n");
		}

		return 0;
	}














}
