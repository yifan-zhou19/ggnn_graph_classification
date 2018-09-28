package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int s;
		int m;
		int n;
		int k;
		String str1 = new String(new char[257]);
		String str2 = new String(new char[257]);
		String str3 = new String(new char[257]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str3 = tempVar3.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		k = str3.length();
		for (i = 0;i <= m - n;i++)
		{
			s = 0;
			for (j = i;j < i + n;j++)
			{
				if (str2.charAt(j - i) == str1.charAt(j))
				{
					s++;
				}
			}
			if (s == n)
			{
				for (j = 0;j < i;j++)
				{
					System.out.printf("%c",str1.charAt(j));
				}
				for (j = 0;j < k;j++)
				{
					System.out.printf("%c",str3.charAt(j));
				}
				for (j = i + n;j < m;j++)
				{
					System.out.printf("%c",str1.charAt(j));
				}
				break;
			}
		}
		if (s != n)
		{
			System.out.printf("%s",str1);
		}
	}

}

