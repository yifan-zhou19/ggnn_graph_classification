package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String dc = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			dc = tempVar.charAt(0);
		}
		a = dc.length();
		System.out.printf("%d",a);
		while (scanf("%s",dc) == 1)
		{
			a = dc.length();
			System.out.printf(",%d",a);
		}
		return 0;
	}




}

