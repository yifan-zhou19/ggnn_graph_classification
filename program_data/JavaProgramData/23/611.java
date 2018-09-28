package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ' ')
			{
				break;
			}
		}
		System.out.printf("%s",a[i]);
		for (i - 1;i - 1 >= 0;i--)
		{
			System.out.printf(" %s",a[i - 1]);
		}
	}
}

