package <missing>;

public class GlobalMembers
{
	//**********************************
	//*???3.cpp                     *
	//*??????                    *
	//*???2011-10-02                *
	//**********************************
	public static int Main()
	{
		//??????abc 
		int a;
		int b;
		int c;
		int[] m = new int[3]; //????,???????? ????,???? ?3 > 2 > 1
		for (a = 1; a <= 3; a++)
		{
			  for (b = 1; b <= 3; b++)
			  {
					for (c = 1; c <= 3; c++)
					{
						  if ((a + (b > a) + (c == a) == 3) && (b + (a > b) + (c < a) == 3) && (c + (c > b) + (a < b) == 3))
						  {
							  m[0] = a;
							  m[1] = b;
							  m[2] = c;
						  }
					}
			  }
		}
		//???????????????A?B?C 
		if (m[0] > m[1] && m[1] > m[2])
		{
				System.out.print("CBA");
		}
		if (m[0] < m[1] && m[1] < m[2])
		{
				System.out.print("ABC");
		}
		if (m[0] > m[2] && m[2] > m[1])
		{
				System.out.print("BCA");
		}
		if (m[0] > m[1] && m[0] < m[2])
		{
				System.out.print("BAC");
		}
		if (m[0] < m[1] && m[1] > m[2])
		{
				System.out.print("CAB");
		}
		if (m[0] > m[1] && m[1] > m[2])
		{
				System.out.print("CBA");
		}
		return 0;
	}

}
