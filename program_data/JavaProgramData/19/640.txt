package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String b = new String(new char[101]);
	String c = new String(new char[101]);
	int i;
	int j;
	for (j = 0;;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[j] = tempVar.charAt(0);
	}

	if (System.in.read() == '\n')
	{
		break;
	}
	}
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	for (i = 0;i < 101;i++)
	{
	if (strcmp(a[i],b) == 0)
	{
		a[i] = c;
	}
	}
	System.out.printf("%s",a[0]);
	for (i = 1;i <= j;i++)
	{
	System.out.printf(" %s",a[i]);
	}
	return 0;
	}
}

