package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] X = new char[20][100];
		int i;
		int A;
		int Q;
		for (i = 0;i < 20;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				X[i] = tempVar.charAt(0);
			}
			Q = System.in.read();
			if (Q == '\n')
			{
				A = i;
				break;
			}
		}
		String W = new String(new char[100]);
		String Y = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			W = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			Y = tempVar3.charAt(0);
		}
		for (i = 0;i <= A;i++)
		{
			if (strcmp(X[i],W) == 0)
			{
				X[i] = Y;
			}
		}
		for (i = 0;i <= A;i++)
		{
			if (i == 0)
			{
				System.out.printf("%s",X[0]);
			}
			else
			{
				System.out.printf(" %s",X[i]);
			}
		}

		return 0;
	}
}

