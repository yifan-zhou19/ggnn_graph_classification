package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		System.out.printf("%d",a.length());
		while (scanf("%s",a) != EOF)
		{
			System.out.printf(",%d",a.length());
		}
		return 0;
	}
}

