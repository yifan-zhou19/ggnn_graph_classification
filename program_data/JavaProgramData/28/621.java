package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[300][40];
		char c;
		int i;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			c = System.in.read();
			if (c != ' ')
			{
				break;
			}
			System.out.printf("%d,",String.valueOf(str[i]).length());
		}
		System.out.printf("%d",String.valueOf(str[i]).length());
	}
}

