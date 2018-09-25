package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] danci = new char[100][100];
		String ch = new String(new char[100]);
		String yaotihuan = new String(new char[100]);
		String tihuan = new String(new char[100]);
		int i;
		int j;
		int k;
		int len;
		ch = new Scanner(System.in).nextLine();
		for (j = 0;j < 100;j++)
		{
			for (k = 0;k < 100;k++)
			{
				danci[j][k] = '\0';
			}
		}
		j = 0;
		k = 0;
		len = ch.length();
		for (i = 0;i < len;i++)
		{
			if (ch.charAt(i) != '\n' && ch.charAt(i) != ' ')
			{
				danci[j][k] = ch.charAt(i);
				k++;
			}
			else
			{
				if (ch.charAt(i) == ' ')
				{
					j++;
					k = 0;
				}
				if (ch.charAt(i) == '\n')
				{
					break;
				}
			}
		}



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yaotihuan = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tihuan = tempVar2.charAt(0);
		}
		for (i = 0;i <= j;i++)
		{
			if (strcmp(danci[i],yaotihuan) == 0)
			{
				danci[i] = tihuan;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",danci[i]);
		}
	System.out.printf("%s",danci[j]);
	return 0;
	}
}

