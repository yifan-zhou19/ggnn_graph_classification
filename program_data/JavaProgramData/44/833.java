package <missing>;

public class GlobalMembers
{
	public static int fx(int n)
	{
		int t = 0;
		do
		{
			t = t * 10 + n % 10;
			n /= 10;
		} while (n != 0);
		return t;
	}
	public static int ab(int n)
	{
		if (n < 0)
		{
		return -ab(-n);
		}
		return fx(n);
	}
	public static int Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.out.printf("%d",ab(t));
		for (i = 1;i <= 5;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 t = Integer.parseInt(tempVar2);
						 }
		System.out.printf("\n%d",ab(t));
		}
	   // getch();
		return 0;
	}

}

