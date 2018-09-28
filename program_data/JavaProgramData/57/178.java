package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			final String b = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			t = a.length();
			switch (a.charAt(t - 1))
			{
			case'r':
			b = a.substring(0, t - 2);
			break;
			case'y':
			b = a.substring(0, t - 2);
			break;
			case'g':
			b = a.substring(0, t - 3);
			break;
			}
			System.out.println(b);
		}
	}
}

