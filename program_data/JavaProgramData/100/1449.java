package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int[] b = new int[26];
	public static char ch;
	public static char i;
	public static char flag;
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		while (ch != '\n')
		{
			if (ch <= 'z' && ch >= 'a')
			{
				a[ch - 'a']++;
			}
			if (ch <= 'Z' && ch >= 'A')
			{
				b[ch - 'A']++;
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
		}
		flag = 0;
		for (i = 0;i < 26;i++)
		{
			if (b[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'A',b[i]);
				flag = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'a',a[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
	}
}

