package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[26];
		int i;
		int j;
		int len;
		int index;
		int t;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 0;k < t;k++)
		{
			flag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (i = 0; i < 26; i++)
			{
				b[i] = 0;
			}

			for (j = 0; j < len; j++)
			{
				index = a.charAt(j) - 'a';
				b[index]++;
			}
			for (j = 0; j < len; j++)
			{
				if (b[a.charAt(j) - 'a'] == 1)
				{
					System.out.printf("%c\n", a.charAt(j));
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}

}

