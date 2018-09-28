package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int i;
		int t;
		int length;
		int[] b = new int[26];
		int flag;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		length = a.length();
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < length;i++)
		{
			flag = a.charAt(i) - 'a';
			b[flag]++;
		}
		for (i = 0;i < length;i++)
		{
			if (b[a.charAt(i) - 'a'] == 1)
			{
				System.out.printf("%c\n",a.charAt(i));
				count = 1;
				break;
			}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
		count = 0;
		}
	}
}

