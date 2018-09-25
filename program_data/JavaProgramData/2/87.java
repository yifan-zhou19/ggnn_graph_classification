package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[1000];
		int[] l = new int[1000];
		int[] count = new int[128];
		int m;
		int max;
		char[][] edi = new char[1000][26];
		String au = new String(new char[128]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				num[j] = Integer.parseInt(tempVar2);
			}
			edi[j] = new Scanner(System.in).nextLine();
			l[j] = String.valueOf(edi[j]).length();
		}
		for (i = 0;i < 128;i++)
		{
			count[i] = 0;
		}
		for (j = 0;j < n;j++)
		{
			for (i = 1;i < l[j];i++)
			{
				m = edi[j][i];
				au = tangible.StringFunctions.changeCharacter(au, m, edi[j][i]);
				count[m]++;
			}
		}
		max = 0;
		for (i = 0;i < 128;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				m = i;
			}
		}
		System.out.printf("%c\n%d",au.charAt(m),max);
		for (j = 0;j < n;j++)
		{
			for (i = 1;i < l[j];i++)
			{
				if (edi[j][i] == au.charAt(m))
				{
					System.out.printf("\n%d",num[j]);
				}
			}
		}
		return 0;
	}

}

