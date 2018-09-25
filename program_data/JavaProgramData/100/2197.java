package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[301]);
		int[] szx = new int[26];
		int[] szd = new int[26];
		int flag = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z')
			{
				szx[zfc.charAt(i) - 'a']++;
				flag++;
			}
			if (zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z')
			{
				szd[zfc.charAt(i) - 'A']++;
				flag++;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < 26;j++)
			{
				if (szd[j] != 0)
				{
					System.out.printf("%c=%d\n",'A' + j,szd[j]);
				}
			}
			for (k = 0;k < 26;k++)
			{
				if (szx[k] != 0)
				{
					System.out.printf("%c=%d\n",'a' + k,szx[k]);
				}
			}
		}
		return 0;
	}


}

