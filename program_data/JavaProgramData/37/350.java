package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[] a = new int[26];
		int i;
		int j;
		int len;
		String input = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			for (j = 0;j < 26;j++)
			{
				a[j] = 0;
			}
			for (j = 0;j < len;j++)
			{
				a[input.charAt(j) - 'a']++;
			}
			for (j = 0;j < len;j++)
			{
				if (a[input.charAt(j) - 'a'] == 1)
				{
					break;
				}
			}
			if (j < len - 1)
			{
				System.out.printf("%c\n",input.charAt(j));
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}




}

