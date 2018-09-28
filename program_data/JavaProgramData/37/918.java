package <missing>;

public class GlobalMembers
{
	public static void pr(tangible.RefObject<String> a)
	{
		int l;
		int i;
		int j;
		int[] num = new int[26];
		for (i = 0;i < 26;i++)
		{
			num[i] = 0;
		}
		l = a.argValue.length();
		for (i = 0;i < l;i++)
		{
			num[a.argValue.charAt(i) - 'a'] += 1;
		}
		for (i = 0,j = 0;i < 26;i++)
		{
			if (num[i] != 1)
			{
				j++;
			}
			if (j == 26)
			{
				System.out.print("no\n");
			}
		}
		if (j != 26)
		{
			for (i = 0;i < l;i++)
			{
				if (num[a.argValue.charAt(i) - 'a'] == 1)
				{
					System.out.printf("%c\n",a.argValue.charAt(i));
					break;
				}
			}
		}
	}
	public static int Main()
	{
		int t;
		int i;
		String a = new String(new char[100000]);
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
				a = tempVar2.charAt(0);
			}
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			pr(tempRef_a);
			a = tempRef_a.argValue;
		}
	}

}

