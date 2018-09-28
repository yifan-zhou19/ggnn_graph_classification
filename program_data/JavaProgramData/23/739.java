package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[80][20];
		char b;
		int i;
		int j;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			b = System.in.read();
			if (b != ' ')
			{
				break;
			}
		}
		System.out.printf("%s",a[i]);
		for (j = i - 1;j >= 1;j--)
		{
			System.out.printf(" %s",a[j]);
		}
	}
}

