package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		int i;
		int j;
		int length1;
		int length2;
		int length3;
		int p;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		length1 = a.length();
		length2 = b.length();
		length3 = c.length();
		for (i = 0;i < length1;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				p = 0;
				for (j = 1;j < length2;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						p = 1;
						break;
					}
				}
				if (p == 0)
				{
					for (j = 0;j < i;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					for (j = 0;j < length3;j++)
					{
						System.out.printf("%c",c.charAt(j));
					}
					for (j = i + length3;j < length1;j++)
					{
						System.out.printf("%c",a.charAt(j));

					}
				p = 2;
				break;
				}
			}
		}
		if (p != 2)
		{
			for (i = 0;i < length1;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}


}

