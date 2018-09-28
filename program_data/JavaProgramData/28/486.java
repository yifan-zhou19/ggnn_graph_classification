package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30]);
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
	}
}

