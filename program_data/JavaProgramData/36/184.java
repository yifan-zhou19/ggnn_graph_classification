package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[52];
		String s = new String(new char[50]);
		String ss = new String(new char[50]);
		int l;
		int ll;
		int i;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ss = tempVar2.charAt(0);
		}
		l = s.length();
		ll = ss.length();
		if (l != ll)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					num[s.charAt(i) - 'a']++;
				}
				else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					num[s.charAt(i) - 'a' + 26]++;
				}
			}
			for (i = 0;i < l;i++)
			{
				if (ss.charAt(i) >= 'A' && ss.charAt(i) <= 'Z')
				{
					num[ss.charAt(i) - 'a']--;
				}
				else if (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z')
				{
					num[ss.charAt(i) - 'a' + 26]--;
				}
			}
			flag = 1;
			for (i = 0;i < 52;i++)
			{
				if (num[i] != 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}


}

