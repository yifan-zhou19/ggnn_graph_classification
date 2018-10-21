package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a =
	{
		{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	char b;
	int max = 0;
	int min = 0;
	int i;
	for (i = 0;;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	if (b == 10)
	{
	break;
	}
	}
	System.out.printf("%d", String.valueOf(a[0]).length());
	for (i = 1;i < 300;i++)
	{
	if (String.valueOf(a[i]).length() != 0)
	{
	System.out.printf(",%d", String.valueOf(a[i]).length());
	}
	else
	{
		break;
	}
	}
	return 0;
	}
}

