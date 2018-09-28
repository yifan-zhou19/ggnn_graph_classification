package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		int i;
		int j;
		int k;
		int p;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				k = i;
				for (j = 0;sub.charAt(j) != '\0';j++)
				{
					if (str.charAt(i) == sub.charAt(j))
					{
					i++;
					}
					else
					{
					break;
					}
				}
				i--;
				if (sub.charAt(j) != '\0')
				{
				   i = k;
				}
				else
				{
					break;
				}
			}
		}
		if (str.charAt(i) == '\0')
		{
			System.out.printf("%s",str);
		}
		else
		{
			for (p = 0;p < k;p++)
			{
			   System.out.printf("%c",str.charAt(p));
			}
			System.out.printf("%s",re);
			for (p = i + 1;str.charAt(p) != '\0';p++)
			{
				System.out.printf("%c",str.charAt(p));
			}
		}
	}

}

