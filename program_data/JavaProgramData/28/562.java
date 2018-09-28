package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		i = a.length();
		System.out.printf("%d",i);
		while (scanf("%s", a) != EOF)
		{
			i = a.length();
			System.out.printf(",%d",i);
		}
		System.out.print("\n");
	}
}

