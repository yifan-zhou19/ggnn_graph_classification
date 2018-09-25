package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[100]);
		char[][] zfc = new char[20][20];
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		sz = new Scanner(System.in).nextLine();
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
		int i;
		int j = 0;
		int k = 0;
		for (i = 0;i <= sz.length();i++)
		{
			if (sz.charAt(i) != '\0' && sz.charAt(i) != ' ')
			{
			  zfc[j][k] = sz.charAt(i);
			  k++;
			}
			if (sz.charAt(i) == '\0' || sz.charAt(i) == ' ')
			{
			 zfc[j][k] = '\0';
			 j++;
			 k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(zfc[i],a) == 0)
			{
			zfc[i] = b;
			}
		}
		System.out.printf("%s",zfc[0]);
		for (i = 1;i < j;i++)
		{
		System.out.printf(" %s",zfc[i]);
		}
		return 0;
	}
}

