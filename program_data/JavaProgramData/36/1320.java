package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	int n;
	int m;
	int i;
	int j;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	n = (int)a.length();
	m = (int)b.length();
	if (n == m)
	{
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < m;j++)
		{
			if (a.charAt(i) == b.charAt(j))
			{
				b = b.substring(0, j);
				break;
			}


		}

		}
	}
	for (j = 0;j < m;j++)
	{
		if (b.charAt(j) != 0)
		{
			sum = sum + 1;
		}
		else
		{
			continue;
		}
	}
	if (sum == 0)
	{
	System.out.print("YES");
	}
	if (sum != 0)
	{
	System.out.print("NO");
	}


		return 0;
	}

}

