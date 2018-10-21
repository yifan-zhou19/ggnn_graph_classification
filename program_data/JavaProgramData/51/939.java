package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String now = new String(new char[5]);
		char[][] gram = new char[250][5];
		int n;
		int[] num = new int[250];
		int i;
		int no;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0,no = 0;a.charAt(i + n - 1) != '\0';i++)
		{
			for (k = 0;k < n;k++)
			{
				now = tangible.StringFunctions.changeCharacter(now, k, a.charAt(i + k));
			}
			now = tangible.StringFunctions.changeCharacter(now, k, '\0');
			if (no == 0)
			{
				gram[no] = now;
				num[no]++;
				no++;
			}
			else
			{
			int flag = 0;
			for (j = 0;j < no;j++)
			{
				if (strcmp(gram[j],now) == 0)
				{
					num[j]++;
					flag = 1;
				}
			}
			if (flag == 0)
			{
				gram[no] = now;
				num[no]++;
				no++;
			}
			}
		}
		int max = 0;
		for (i = 0;i < no;i++)
		{
			if (num[i] > 1)
			{
				if (num[i] > max)
				{
					max = num[i];
				}
			}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < no;i++)
			{
				if (num[i] == max)
				{
					System.out.printf("%s\n",gram[i]);
				}
			}
		}
		return 0;
	}
}

