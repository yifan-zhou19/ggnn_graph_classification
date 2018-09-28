package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int an = 0;
	int bn = 0;
	int j;
	int i;
	int t = 0;
	String a = new String(new char[50]);
	String b = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	an = a.length();
	bn = b.length();
	for (i = 0;i < bn;i++)
	{
		if (b.charAt(i) == a.charAt(0))
		{
		for (j = i;j < (i + an);j++)
		{
			if (b.charAt(j) != a.charAt(j - i))
			{
				break;
			}
			else if (j == i + an - 1)
			{
				System.out.printf("%d",i);
				t = 1;
			}
		}

		}
		if (t == 1)
		{
			break;
		}
	}


	}
}

