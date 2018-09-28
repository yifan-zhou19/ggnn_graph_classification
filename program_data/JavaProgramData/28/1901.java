package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String e = new String(new char[50]);
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = tempVar.charAt(0);
		}
		System.out.printf("%d",e.length());
		while (scanf("%s",e) == 1)
		{
			System.out.printf(",%d",e.length());
		}
	}
}

