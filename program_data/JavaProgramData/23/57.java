package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 1;
		int i;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		n++;
		}
			for (i = n - 1;i > 0;i--)
			{
			System.out.printf("%s ",a[i]);
			}
			System.out.printf("%s",a[0]);
	}

}

