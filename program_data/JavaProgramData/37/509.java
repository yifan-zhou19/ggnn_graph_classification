package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100000]);
		int t;
		int i;
		int[] b = new int[26];
		int len;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			for (i = 0;i < 26;i++)
			{
				b[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (i = 0;i < len;i++)
			{
				b[a.charAt(i) - 'a']++;
			}
			for (i = 0;i < len;i++)
			{
				if (b[a.charAt(i) - 'a'] == 1)
				{
					flag = 1;
					System.out.printf("%c\n",a.charAt(i));
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			flag = 0;
		}
	}
}

