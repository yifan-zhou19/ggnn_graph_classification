package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
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
		for (int j = 0;j < i;j++)
		{
			System.out.printf("%s ",a[i - j]);
		}
		System.out.printf("%s",a[0]);
		 return 0;




	}

}

