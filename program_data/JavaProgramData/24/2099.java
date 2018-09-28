package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char h;
		char[][] s = new char[200][100];
		int i = 0;
		int j = 0;
		int geshu;
		int max;
		int min;
		int b = 0;
		int a = 0;
		int[] length = new int[1000];
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			h = tempVar.charAt(0);
		}
		while (h != '\n')
		{
			s[i][j] = h;
			if (h == ' ')
			{
				s[i][j] = '\0';
				i++;
				j = -1;
			}
			j++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				h = tempVar2.charAt(0);
			}
		}
		s[i][j] = '\0';
		geshu = i + 1;


		for (i = 0;i < geshu;i++)
		{
			length[i] = String.valueOf(s[i]).length();
		}

		max = length[0];
		for (i = 1;i < geshu;i++)
		{
			if (length[i] > max)
			{
				max = length[i];
				a = i;
			}
		}
		System.out.printf("%s\n",s[a]);

		min = length[0];
		for (i = 1;i < geshu;i++)
		{
			if (length[i] < min)
			{
				min = length[i];
				b = i;
			}
		}
		System.out.printf("%s\n",s[b]);





		return 0;
	}
}

