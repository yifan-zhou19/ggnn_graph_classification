package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k = 0;
		int l = 0;
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
		for (i = 0;i < a.length();i++)
		{
			for (j = l;j < b.length();j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					k++;
					l = j + 1;
					break;
				}
			}
		}
		if (k == a.length())
		{
			System.out.printf("%d",j + 1 - k);
		}
		return 0;
	}
}

