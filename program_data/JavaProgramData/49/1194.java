package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int m;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		m = a.length();
		for (i = 2;i <= m;i++)
		{
		for (j = 0;j <= m - i;j++)
		{
		for (k = 0,x = 0;k < i / 2;k++)
		{
		if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
		{
		x = 1;
		}
		else
		{
		x = 0;
		break;
		}
		}
		if (x == 1)
		{
		for (y = j;y <= j + i - 1;y++)
		{
		System.out.printf("%c",a.charAt(y));
		}
		System.out.print("\n");
		}
		x = 0;
		}
		}
	}
}

