package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char[][] zfc = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
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
		int n = s.length();
		int i = 0;
		int j;
		int k = 0;
		for (j = 0;j <= n;j++)
		{
			if (s.charAt(j) == ' ' || s.charAt(j) == ',' || s.charAt(j) == '\0')
			{
				if (k != 0)
				{
					zfc[i][k] = '\0';
					i++;
				}
				k = 0;
			}
			else
			{
				zfc[i][k] = s.charAt(j);
				k++;
			}
		}
		for (j = 0;j < i - 1;j++)
		{
	   if (strcmp(zfc[j],a) == 0)
	   {
		  zfc[j] = b;
	   }
		System.out.printf("%s ", zfc[j]);
		}
		if (strcmp(zfc[j],a) == 0)
		{
			zfc[j] = b;
		}
		System.out.printf("%s\n", zfc[j]);
		return 0;
	}





}

