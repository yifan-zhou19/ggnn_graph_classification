package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 1;
		int j;
		int len;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n + 1)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			if ((a[len - 1] == 'r' && a[len - 2] == 'e') || (a[len - 1] == 'y' && a[len - 2] == 'l'))
			{
			for (j = 0;j <= len - 3;j++)
			{
			System.out.printf("%c",a[j]);
			}
			System.out.print("\n");
			}
			if (a[len - 3] == 'i' && a[len - 2] == 'n' && a[len - 1] == 'g')
			{
				for (j = 0;j <= len - 4;j++)
				{
				System.out.printf("%c",a[j]);
				}
				System.out.print("\n");
			}
			i++;
		}
	}
}

