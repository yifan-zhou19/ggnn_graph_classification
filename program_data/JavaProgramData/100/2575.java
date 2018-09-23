public class count
{
	public int num;
	public char ch;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		count[] s = tangible.Arrays.initializeWithDefaultcountInstances(53);
		int i;
		int len;
		int n;
		int j;
		String str = new String(new char[MAX]);
		char c;
		str = new Scanner(System.in).nextLine();
		System.in.read();
		len = str.length();
		c = 'A';
		for (i = 0;i < 26;i++)
		{
			s[i].ch = c;
			c++;
		}
		c = 'a';
		for (i = 26;i < 52;i++)
		{
			s[i].ch = c;
			c++;
		}
		for (i = 0;i < 52;i++)
		{
			s[i].num = 0;
		}
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
			{
				for (j = 0;j < 52;j++)
				{
					if (s[j].ch == str.charAt(i))
					{
						s[j].num++;
					}
				}
			}
		}
		int flag = 0;
		for (i = 0;i < 52;i++)
		{
			if (s[i].num != 0)
			{
				System.out.printf("%c=%d\n",s[i].ch,s[i].num);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

