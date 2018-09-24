package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int AmountA;
		int AmountB;
		int AmountC;
		int jumpout = 0;
		for (AmountA = 0 ; AmountA <= 2 ; AmountA++)
		{
			for (AmountB = 0 ; AmountB <= 2 ; AmountB++)
			{
				if (AmountB == AmountA)
				{
					continue;
				}
				for (AmountC = 0 ; AmountC <= 2 ; AmountC++)
				{
					if ((AmountC == AmountB) || (AmountC == AmountA))
					{
						continue;
					}
					A = ((AmountB > AmountB) + (AmountA == AmountC));
					B = ((AmountA > AmountB) + (AmountA > AmountC));
					C = ((AmountC > AmountB) + (AmountB > AmountA));
					if ((A == 2 - AmountA) && (B == 2 - AmountB) && (C == 2 - AmountC))
					{
						jumpout = 1;
					}
					break;
				}
				if (jumpout == 1)
				{
					break;
				}
			}
			if (jumpout == 1)
			{
				break;
			}
		}
		if (AmountA < AmountB && AmountB < AmountC)
		{
			System.out.print("ABC");
		}
		if (AmountB < AmountA && AmountA < AmountC)
		{
			System.out.print("BAC");
		}
		if (AmountC < AmountB && AmountB < AmountA)
		{
			System.out.print("CBA");
		}
		if (AmountB < AmountC && AmountC < AmountA)
		{
			System.out.print("BCA");
		}
		if (AmountA < AmountC && AmountC < AmountB)
		{
			System.out.print("ACB");
		}
		if (AmountC < AmountA && AmountA < AmountB)
		{
			System.out.print("CAB");
		}
		return 0;
	}
}
