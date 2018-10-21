package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		int i;
		int p;
		int t;
		int j = 0;
		for (i = 0;i < b.length();i++)
		{
			for (;j < a.length();j++)
			{
				t = i;
				if (a.charAt(j) == b.charAt(t + j))
				{
					p = 1;
				}
				else
				{
					break;
				}
			}
			if (p == 1)
			{
				break;
			}
		}
		System.out.printf("%d",t);
		return 0;
	}
}

