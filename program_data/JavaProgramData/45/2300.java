package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[SIZE]);
		String b = new String(new char[SIZE]);
		int i;
		int j;
		int n1;
		int n2;
		int ok = 1;
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
		n1 = a.length();
		n2 = b.length();
		for (i = 0;i < n2;i++)
		{
			ok = 1;
			for (j = 0;j < n1;j++)
			{
				if (a.charAt(j) != b.charAt(i + j))
				{
					ok = 0;
					break;
				}
			}
			if (ok != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

}

