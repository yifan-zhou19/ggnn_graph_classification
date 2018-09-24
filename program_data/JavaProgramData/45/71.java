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
		int j;
		int cnt = 0;
		int n;
		n = a.length();
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == b.charAt(i + j))
				{
					cnt++;
				}
			}
			if (cnt == n)
			{
				System.out.printf("%d",i);
				break;
			}
			else
			{
				cnt = 0;
			}
		}

	return 0;
	}
}

