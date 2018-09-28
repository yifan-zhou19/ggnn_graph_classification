package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
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
	for (i = 0;i < 256;i++)
	{
		k = 0;
		for (j = 0;j < b.length();j++)
		{
			if (a.charAt(j + i) != b.charAt(j))
			{
				k = 1;
				break;
			}
		}
		//printf("%d",k);
		if (k == 0)
		{
			for (j = 0;j < i;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			for (j = 0;j < c.length();j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			for (j = i + b.length();j < a.length();j++)
			{
				System.out.printf("%c",a.charAt(j));
			}

			break;
		}

	}
	if (k == 1)
	{
			for (j = 0;j < a.length();j++)
			{
				System.out.printf("%c",a.charAt(j));
			}

	}
	//	printf("\n");
		return 0;
	}

}

