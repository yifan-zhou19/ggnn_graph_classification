package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k = 0;
		int l;
		int m0;
		int m1;
		int[] a = new int[100];
		int flag = 0;
		char[][] str = new char[3][300];
		for (i = 0;i < 3;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
		}
		m0 = String.valueOf(str[0]).length();
		m1 = String.valueOf(str[1]).length();
		for (i = 0,j = 0;i < m0,j < m1;i++)
		{
			if (str[0][i] == str[1][j])
			{
				j++;
				flag++;
				if (flag == m1)
				{
					k = i - m1;
					break;
				}
			}
			else
			{
				j = 0;
				flag = 0;
			}
		}
			if (flag == m1)
			{
				for (i = k + 1,j = 0;i < k + m1 + 1;i++,j++)
				{
					str[0][i] = str[2][j];
				}
				System.out.printf("%s",str[0]);
			}
			else
			{
				System.out.printf("%s",str[0]);
			}
	}


}

