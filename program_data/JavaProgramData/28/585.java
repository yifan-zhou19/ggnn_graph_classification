package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		System.out.printf("%d",a.length());
		b = System.in.read();
		if (b == ' ')
		{
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf(",%d",a.length());
			b = System.in.read();
			if (b != ' ')
			{
				break;
			}
		}
		}
	}

}

