package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int num;
		int j;
		int k;
	char[][] a = new char[30][30];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
	num = String.valueOf(a[i]).length();
	if (a[i][num - 1] == 'r')
	{
	a[i][num - 2] = '\0';
	}
	if (a[i][num - 1] == 'y')
	{
	a[i][num - 2] = '\0';
	}
	if (a[i][num - 1] == 'g')
	{
	a[i][num - 3] = '\0';
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.println(a[i]);
	}
	}
}

