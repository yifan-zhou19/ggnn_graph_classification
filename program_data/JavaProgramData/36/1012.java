package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[][] da = new int[2][26];
		int[][] xiao = new int[2][26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int l1;
		int l2;
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				xiao[0][a.charAt(i) - 'a']++;
			}
			else
			{
				da[0][a.charAt(i) - 'A']++;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				xiao[1][b.charAt(i) - 'a']++;
			}
			else
			{
				da[1][b.charAt(i) - 'A']++;
			}
		}
		int flag = 0;
		for (i = 0;i < 26;i++)
		{
			if (da[0][i] != da[1][i])
			{
				flag = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (xiao[0][i] != xiao[1][i])
			{
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

