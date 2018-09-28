package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n = 0;
	String chang = new String(new char[50]);
	String duan = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		duan = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		chang = tempVar2.charAt(0);
	}
	for (i = 0;i < 50;i++)
	{
	if (duan.charAt(0) == chang.charAt(i))
	{
	for (j = 0;duan.charAt(j) != '\0';j++)
	{
	if (duan.charAt(j) != chang.charAt(j + i))
	{
	n = 1;
	}
	}
	if (n == 0)
	{
	System.out.printf("%d",i);
	break;
	}
	}
	}
	}
}

