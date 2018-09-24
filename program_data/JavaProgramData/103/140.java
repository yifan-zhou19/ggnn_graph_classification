package <missing>;

public class GlobalMembers
{
	public static char shift(char y)
	{
		char x;
		if (y >= 'a')
		{
		x = y - 'a'+'A';
		}
		else
		{
		x = y;
		}
		return x;
	}
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int sum = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		System.out.printf("(%c,",shift(a.charAt(0)));
		for (i = 1;;i++)
		{
			if (shift(a.charAt(i)) == shift(a.charAt(i - 1)))
			{
				sum++;
			}
			if ((shift(a.charAt(i)) != shift(a.charAt(i - 1))) && (a.charAt(i) != '\0'))
			{
				System.out.printf("%d)(%c,",sum,shift(a.charAt(i)));
				sum = 1;
			}
			if (a.charAt(i) == '\0')
			{
				System.out.printf("%d)",sum);
				break;
			}
		}
	}

}

