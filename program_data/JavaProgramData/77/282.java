package <missing>;

public class GlobalMembers
{
	public static char x;
	public static char y;
	public static int Main()
	{
		int i;
		void result(char a[]);
		String line = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		x = line.charAt(0);
		for (i = 0;i <= line.length() - 1;i++)
		{
			if (line.charAt(i) != x)
			{
				y = line.charAt(i);
			break;
			}
		}
		result(line);

		return 0;
	}
	public static void result(String a)
	{
		if ((!a[0].equals('.')) && (!a[a.length() - 1].equals('.')))
		{
		int i;
		int j;
		for (i = 1;i <= (a.length() - 1);i++)
		{
			if (a[i].equals(y))
			{
			for (j = i - 1;j >= 0;j--)
			{
				if (a[j].equals(y))
				{
					break;
				}
				else if (a[j].equals(x))
				{
					System.out.printf("%d %d",j,i);
					System.out.print("\n");
					a[i] = '.';
					a[j] = '.';
					break;
				}
			}
			}
		}
		result(a);
		}

	}

}

