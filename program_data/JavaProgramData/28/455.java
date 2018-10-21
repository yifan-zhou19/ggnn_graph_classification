package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		i = s.length();
		System.out.printf("%d",i);
		while (scanf("%s", s) != EOF)
		{
			i = s.length();
			System.out.printf(",%d",i);
		}
		System.in.read();
		System.in.read();
	}

}

