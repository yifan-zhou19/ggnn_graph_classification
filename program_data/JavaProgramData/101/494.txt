package <missing>;

public class GlobalMembers
{
	//**********************
	//********???********
	//*??:?? 1100012915*
	//******??:10.12******
	//**********************
	public static int Main()
	{
		int a; //a?b?c?A?B?C???
		int b;
		int c;
		int at;
		int bt;
		int ct;
		int shunxu1;
		int shunxu2;
		for (a = 1 ; a <= 3 ; a++) //????...
		{
			for (b = 1 ; b <= 3 ; b++)
			{
				if (b != a)
				{
					for (c = 1 ; c <= 3 ; c++)
					{
						if (c != a && c != b)
						{
							at = (b > a) + (c == a); //at,bt,ct?A?B?C?????
							bt = (a > b) + (a > c);
							ct = (c > b) + (b > a);
							shunxu1 = a * 100 + b * 10 + c; //???????????????????????????
							shunxu2 = at * 100 + bt * 10 + ct;
							if (shunxu1 + shunxu2 == 333) //???????????
							{
								switch (shunxu1) //switch?if????...
								{
								case 123 :
									System.out.print("ABC");
									break; //123??A???1?B?2?C?3???????????ABC
								case 132 :
									System.out.print("ACB");
									break;
								case 213 :
									System.out.print("BAC");
									break;
								case 231 :
									System.out.print("CAB");
									break;
								case 312 :
									System.out.print("BCA");
									break;
								default :
									System.out.print("CBA");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
