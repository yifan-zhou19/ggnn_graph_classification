package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		char[][] a = new char[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
			for (i = 1;System.in.read() != '\n';i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = tempVar2.charAt(0);
				}
			}
			for (i = i - 1;i >= 0;i--)
			{
				if (i == 0)
				{
				System.out.printf("%s",a[i]);
				}
				else
				{
				System.out.printf("%s ",a[i]);
				}
			}
	}
}

