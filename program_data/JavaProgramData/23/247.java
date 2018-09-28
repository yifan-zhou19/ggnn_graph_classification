package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][50];
		char c;
		int i = 0;
		do
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
			i++;
		}while (c != '\n');
		System.out.printf("%s",a[i - 1]);
		i = i - 2;
		for (;i >= 0;i--)
		{
			System.out.printf(" %s",a[i]);
		}
		System.out.print("\n");
	}
}

