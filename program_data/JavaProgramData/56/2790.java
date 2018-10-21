package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void NIXU(int x);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		NIXU(n);
	}
	public static void NIXU(int x)
	{
		int i;
		if ((i = x / 10) != 0)
		{
			System.out.print(x % 10 + '0');
			NIXU(i);
		}
		else
		{
			System.out.print(x + '0');
		}
	}
}

