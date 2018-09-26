package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] count = new int[500];
		int l = 0;
		int max = 0;
		int n;
		int len;
		int i;
		int j;
		int k;
		int check;
		int flag;
		String str = new String(new char[500]);
		char[][] ans = new char[500][500];
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
		len = str.length();
		for (i = 0;i <= len - n;i++)
		{
			check = 0;
			for (j = 1;j <= l;j++)
			{
				flag = 0;
				for (k = 0;k < n;k++)
				{
				  if (ans[j][k] != str.charAt(i + k))
				  {
						flag = 1;
						break;
				  }
				}
				if (flag == 0)
				{
					check = 1;
					count[j]++;
					if (count[j] > max)
					{
						max = count[j];
					}
					break;
				}
			}
			if (check == 0)
			{
					l++;
					for (j = 0;j < n;j++)
					{
						ans[l][j] = str.charAt(i + j);
					}
					count[l] = 1;
			}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 1;i <= l;i++)
			{
				if (count[i] == max)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",ans[i][j]);
					}
					System.out.print("\n");
				}
			}
		}
	}

}

