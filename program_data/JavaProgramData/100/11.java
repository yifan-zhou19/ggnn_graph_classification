package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[26]);
		String str = new String(new char[300]);
		int[] num = new int[26];
		int n;
		int i;
		int l;
			 for (i = 0;i < 26;i++)
			 {
				 num[i] = 0;
			 }
		for (i = 0;i < 26;i++)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, i, 'a' + i);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if ('a' <= str.charAt(i),str.charAt(i) <= 'z')
			{
				num[str.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",ch.charAt(i),num[i]);
			}
		}
		int sum = 0;
		for (i = 0;i < 26;i++)
		{
			sum += num[i];
		}
		if (sum == 0)
		{
			System.out.print("No\n");
		}
	}

}

