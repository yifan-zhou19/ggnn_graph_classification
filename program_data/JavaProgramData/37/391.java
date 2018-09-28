package <missing>;

public class GlobalMembers
{
	public static String s;

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
		int[] count = new int[26];
		int[] p = new int[26];
		int n;
		char cc;
		char key = '-';
		int min = 100001;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			cc = tempVar2.charAt(0);
		}

		while (n-- != 0)
		{
			s = new Scanner(System.in).nextLine();
			for (i = 0;i < 26;i++)
			{
				count[i] = 0;
				p[i] = 100001;
			}
			for (i = 0;i < s.length();i++)
			{
				count[*(s.Substring(i)) - 'a']++;
				if (p[*(s.Substring(i)) - 'a'] > i)
				{
					p[*(s.Substring(i)) - 'a'] = i;
				}
			}
			key = '-';
			min = 100001;
			for (i = 0;i < 26;i++)
			{
				if (count[i] == 1 && p[i] < min)
				{
					key = 'a' + i;
					min = p[i];
				}
			}
			if (key == '-')
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",key);
			}
		}

		return 0;
	}
}

