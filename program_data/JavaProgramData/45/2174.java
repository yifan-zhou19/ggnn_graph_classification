package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String z = new String(new char[50]);
	String m = new String(new char[50]);
	int a;
	int n;
	int b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		z = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = tempVar2.charAt(0);
	}
	n = z.length();
	for (int i = 0;i < 50;i++)
	{
		if ((m.charAt(i) == z.charAt(0)) && (m[i + n - 1] = z.charAt(n - 1)))
		{
			a = 1;
			for (int j = i + 1;j < i + n - 2;j++)
			{
				if (m.charAt(j) != z.charAt(a))
				{
					b = 1;
				}
				a++;
			}
			if (b == 0)
			{
			System.out.printf("%d",i);
			break;
			}
		}
	}
	return 0;
	}

}

