package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k = 0;
		int flag = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = i;j < b.length() + i;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k++, a.charAt(j));
			}
			c = c.substring(0, k);
			if (strcmp(b,c) == 0)
			{
				System.out.printf("%d",i);
				flag = 1;
							   break;
			}
			k = 0;
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

