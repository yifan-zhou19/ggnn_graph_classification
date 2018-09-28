package <missing>;

public class GlobalMembers
{
	public static int Capple(int Nmonkey,int Nthrow)
	{
		int i;
		int j;
		int Napple;
		for (j = 1;;j++)
		{
			Napple = j * Nmonkey + Nthrow;
			for (i = 1;i < Nmonkey && Napple % (Nmonkey - 1) == 0;i++)
			{
				Napple = Napple / (Nmonkey - 1) * Nmonkey + Nthrow;
			}
			if (i == Nmonkey)
			{
				return Napple;
			}
		}
	}
	public static int Main()
	{
		int Napple;
		int Nmonkey;
		int Nthrow;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Nmonkey = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			Nthrow = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",Capple(Nmonkey, Nthrow));
		return 0;
	}

}

