package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
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
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			int j;
			for (j = 0;(b.charAt(j) == a.charAt(i + j)) && (b.charAt(j) != '\0');j++)
			{
				;
			}
			if (b.charAt(j) == '\0')
			{
				for (int k = 0;k < i;k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
				System.out.printf("%s",c);
				for (int k = i + j;a.charAt(k) != '\0';k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
				return 0;
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

