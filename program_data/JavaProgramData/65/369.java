package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//



	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int n;
		int N;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 1;n <= N;n++)
		{
			int A;
			int B;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B = Integer.parseInt(tempVar3);
			}
			if ((A == 0 && B == 1) || (A == 1 && B == 2) || (A == 2 && B == 0))
			{
				a = a + 1;
			}
			else
			{
				if ((B == 0 && A == 1) || (B == 1 && A == 2) || (B == 2 && A == 0))
				{
					b = b + 1;
				}
				else
				{
					;
				}
			}
		}
		if (a > b)
		{
			System.out.print("A\n");
		}
		else
		{
			if (b > a)
			{
				System.out.print("B\n");
			}
			else
			{
				System.out.print("Tie\n");
			}
		}
		return 0;
	}


}

