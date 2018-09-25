package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][20];
		char m;
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		int i;
		int j;
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
			b = new Scanner(System.in).nextLine();
			c = new Scanner(System.in).nextLine();
		for (j = 0;j <= i;j++)
		{
			if (strcmp(a[j],b) == 0)
			{
				a[j] = c;
			}
		}



		for (j = 0;j < i;j++)
		{
			System.out.printf("%s ",a[j]);
		}
		System.out.printf("%s",a[i]);

	}

}

