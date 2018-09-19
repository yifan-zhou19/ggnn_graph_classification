package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] len = new int[1000];
		int[] b = new int[26];
		int[] a = new int[1000];
		char[][] str = new char[1000][26];
		int m;
		int i;
		int j;
		int max;
		int num;
		char c;
		int pos;
		int temp;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str[i] = tempVar3.charAt(0);
			}
			len[i] = String.valueOf(str[i]).length();
			for (j = 0;j < len[i];j++)
			{
				temp = str[i][j] - 'A';
				b[temp]++;
			}
		}

		max = b[0];
		pos = 0;
		for (i = 1;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				pos = i;
			}
		}
		c = pos + 'A';
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",max);
		num = 0;
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < len[i];j++)
			{
				if (str[i][j] == c)
				{
					num++;
					if (num < max)
					{
						System.out.printf("%d\n",a[i]);
					}
					else
					{
						System.out.printf("%d",a[i]);
					}
				}
			}
			}
	}
}

