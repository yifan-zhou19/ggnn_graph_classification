package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		String a = new String(new char[1009]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		m = a.length();
		for (i = 0;i < m;)
		{
			int count = 0;
			for (j = i;j < m;j++)
			{
				if (a.charAt(i) == a.charAt(j) || a.charAt(i) == (a.charAt(j) + 'A'-'a') || a.charAt(i) == (a.charAt(j) - 'A'+'a'))
				{
				count++;
				}
				else
				{
				break;
				}
			}
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			{
			System.out.printf("(%c,%d)",a.charAt(i),count);
			}
			else
			{
			System.out.printf("(%c,%d)",a.charAt(i) + 'A'-'a',count);
			}
			i = i + count;
		}
	}
}

