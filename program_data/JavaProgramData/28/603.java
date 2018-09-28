package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c = '\n';
		String a = new String(new char[100]);
		int i;
		for (i = 0;;i++)
		{
			if (i == 0)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a = tempVar.charAt(0);
				}
			System.out.printf("%d",a.length());
			}
			else
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf(",%d",a.length());
			}
			if (c == System.in.read())
			{
				break;
			}
		}
	}
}

