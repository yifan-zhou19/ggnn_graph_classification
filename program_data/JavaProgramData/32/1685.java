package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len;
		int tlen;
		int t = 0;
		char[][] num1 = new char[100][200];
		char[][] num2 = new char[100][200];
		String temp = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num2[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			temp = num2[i];
			t = 0;
			tlen = String.valueOf(num1[i]).length() - String.valueOf(num2[i]).length();
			for (j = 0;j < tlen;j++)
			{
				num2[i][j] = '0';
			}
			num2[i][j] = 0;
			num2[i] += temp;
			len = String.valueOf(num1[i]).length();
			for (j = len - 1;j >= 0;j--)
			{
				if (num1[i][j] + t - num2[i][j] >= 0)
				{
					num1[i][j] = num1[i][j] + t - num2[i][j] + 48;
					t = 0;
				}
				else
				{
					num1[i][j] = num1[i][j] + t - num2[i][j] + 58;
				t = -1;
				}
			}

			if (i != n - 1)
			{
			System.out.printf("%s\n",num1[i]);
			}
			else
			{
				System.out.printf("%s",num1[i]);
			}
		}

	}
}

