package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		int i;
		int j;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		System.out.printf("%s",a[i]);
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf(" %s",a[j]);
		}
		System.out.print("\n");
	}
}

