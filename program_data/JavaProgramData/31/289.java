package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[2000][20];
	char[][] b = new char[2000][20];
	char[][] c = new char[2000][20];
	char[][] d = new char[2000][20];
	char[][] e = new char[2000][20];
	char[][] s = new char[2000][20];
	int i = 0;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = tempVar.charAt(0);
	}
	while (true)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i] = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		e[i] = tempVar4.charAt(0);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		s[i] = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		d[i] = tempVar6.charAt(0);
	}
	i++;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		a[i] = tempVar7.charAt(0);
	}
	if (a[i][0] == 'e')
	{
	break;
	}
	}
	for (j = i - 1;j >= 0;j--)
	{
	System.out.printf("%s %s %s %s %s %s\n",a[j],b[j],c[j],e[j],s[j],d[j]);
	}
	}

}

