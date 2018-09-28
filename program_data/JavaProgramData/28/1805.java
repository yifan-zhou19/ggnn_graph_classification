package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[300][20];
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = tempVar.charAt(0);
	}
	n = String.valueOf(a[0]).length();
	System.out.printf("%d",n);
	for (i = 1;i < 300;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	n = String.valueOf(a[i]).length();
	if (n == 0)
	{
		break;
	}
	else
	{
	System.out.printf(",%d",n);
	}
	}



		return 0;
	}


}

