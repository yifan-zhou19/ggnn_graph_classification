package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int m;
		int good;
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
		n = a.length();
		while (b.charAt(i) != '\0')
		{
			good = 0;
			for (j = i,m = 0;m < n;j++,m++)
			{
				if (a.charAt(m) != b.charAt(j))
				{
					good++;
				}
			}
			if (good == 0)
			{
				System.out.printf("%d",j - m);
				break;
			}
			i++;
		}
		return 0;
	}

}

