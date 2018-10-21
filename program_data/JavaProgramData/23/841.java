package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char c;
		int n;
		int i;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.printf("%s",a[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
	}
}

