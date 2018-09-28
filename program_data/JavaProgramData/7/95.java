package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[257]);
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;i < zfc.length();i++)
		{
			if (a.charAt(0) == zfc.charAt(i))
			{
				for (j = 1;j < a.length();j++)
				{
					if (a.charAt(j) != zfc.charAt(i + j))
					{
						break;
					}
				}
				if (j == a.length())
				{
					break;
				}
			}
		}
		if (j == a.length())
		{
		   for (k = 0;k < i;k++)
		   {
			   System.out.printf("%c",zfc.charAt(k));
		   }
		   for (k = i;k < i + b.length();k++)
		   {
			   System.out.printf("%c",b.charAt(k - i));
		   }
		   for (k = i + b.length();k < zfc.length();k++)
		   {
			   System.out.printf("%c",zfc.charAt(k));
		   }
		}
		else
		{
			System.out.printf("%s",zfc);
		}
		return 0;
	}
}

