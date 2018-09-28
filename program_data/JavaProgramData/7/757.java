package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int m;
		String zfc = new String(new char[1000]);
		String zfc_1 = new String(new char[100]);
		String zfc_2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc_1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc_2 = tempVar3.charAt(0);
		}
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (j == (int)zfc_1.length())
			{
				break;
			}
			if (zfc.charAt(i) == zfc_1.charAt(j))
			{
				j++;
			}
			else
			{
				j = 0;
			}
		}
		if (j == (int)zfc_1.length())
		{
			for (m = 0;m < i - j;m++)
			{
			System.out.printf("%c",zfc.charAt(m));
			}
		System.out.printf("%s",zfc_2);
		for (m = i;m < (int)zfc.length();m++)
		{
			System.out.printf("%c",zfc.charAt(m));
		}
		}
		else
		{
			System.out.printf("%s",zfc);
		}
		return 0;
	}

}

