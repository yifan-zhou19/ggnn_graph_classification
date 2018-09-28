package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sup;
		int inf;
		int i = 0;
		int j;
		int max;
		int min;
		char[][] str = new char[200][100];
		char b;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b != ' ' && b != ',')
			{
				break;
			}
			else
			{
				i++;
			}
		}
		sup = String.valueOf(str[0]).length();
		max = 0;
		inf = String.valueOf(str[0]).length();
		min = 0;
		for (j = 1;j <= i;j++)
		{
			if (String.valueOf(str[j]).length() > sup)
			{
			sup = String.valueOf(str[j]).length();
		max = j;
			}
		if (String.valueOf(str[j]).length() < inf)
		{
			inf = String.valueOf(str[j]).length();
		min = j;
		}
		}
		System.out.printf("%s\n%s",str[max],str[min]);
	}
}

