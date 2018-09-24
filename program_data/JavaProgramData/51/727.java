package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[501]);
		char[][] s = new char[500][5];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		int i;
		int j;
		int len = str.length();
		int num = len - n + 1;
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < n;j++)
			{
			s[i][j] = str.charAt(i + j);
			}
			s[i][j] = '\0';

		}
		int[] total = new int[500];
		for (i = 0;i < 500;i++)
		{
		total[i] = 1;
		}
		for (i = 0;i < num - 1;i++)
		{
			for (j = i + 1;j < num;j++)
			{
		if (strcmp(s[i],s[j]) == 0)
		{
			total[i]++;
		}

			}
		}
		int max = 2;
		int shu = 0;
		int[] ji = new int[500];
		int flag = 0;
		for (i = 0;i < num - 1;i++)
		{
			if (total[i] >= max)
			{
				flag = 1;
		max = total[i];
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			if (total[i] == max)
			{
		ji[shu] = i;
		shu++;
			}
		}




		if (flag == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < shu;i++)
			{

		System.out.printf("%s\n",s[ji[i]]);
			}
		}


	}


}

