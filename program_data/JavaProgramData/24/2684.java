package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] count = new int[201];
		int[] paixu = new int[201];
		int flag;
		int len;
		int m;
		int tem;
		int i;
		int j;
		String sen = new String(new char[2000]);
		char[][] word = new char[201][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		sen = new Scanner(System.in).nextLine();
		len = sen.length();
		flag = 0;
		m = 0;
		for (i = 0;i < len;i++)
		{
			if ((sen.charAt(i) != ' ') && (flag == 1))
			{
				word[m][count[m]++] = sen.charAt(i);
			}
			if ((sen.charAt(i) != ' ') && (flag == 0))
			{
				word[m][count[m]++] = sen.charAt(i);
				flag = 1;
			}
			if ((sen.charAt(i) == ' ') && (flag == 1))
			{
				m++;
				flag = 0;
			}
		}
		for (i = 0;i <= m;i++)
		{
			paixu[i] = count[i];
		}
		for (i = 0;i <= m;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (paixu[i] < paixu[j])
				{
					tem = paixu[i];
					paixu[i] = paixu[j];
					paixu[j] = tem;
				}
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (count[i] == paixu[0])
			{
				for (j = 0;j < count[i];j++)
				{
					System.out.printf("%c",word[i][j]);
				}
				break;
			}
		}
		System.out.print("\n");
		for (i = 0;i <= m;i++)
		{
			if (count[i] == paixu[m])
			{
				for (j = 0;j < count[i];j++)
				{
					System.out.printf("%c",word[i][j]);
				}
				break;
			}
		}
		return 0;
	}




}

