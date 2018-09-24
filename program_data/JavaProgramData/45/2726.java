package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str1 = new String(new char[55]);
		String str2 = new String(new char[55]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		int l1;
		int l2;
		l1 = str1.length();
		l2 = str2.length();
		int i;
		int j;
		int count = 0;
		for (i = 0;i < l2;i++)
		{
			if (str2.charAt(i) == str1.charAt(0))
			{
				for (j = 1;j < l1;j++)
				{
					if (str1.charAt(j) == str2.charAt(i + j))
					{
						count++;
					}
				}
				if (count == l1 - 1)
				{
					System.out.printf("%d",i);
				}
			}
		}
	}
}

