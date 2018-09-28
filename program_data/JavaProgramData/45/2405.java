package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		int i = 0;
		int j = 0;
		for (i = 0;i < b.length();i++)
		{
			if (a.charAt(j) == b.charAt(i))
			{
				j++;
				if (j == a.length())
				{
					System.out.printf("%d",i - j + 1);
				}
			}
			else
			{
				j = 0;
			}
		}

	}
}

