public class string
{
	public char cha;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[310]);
		string[] s = new string[52];
		string temp;
		int i;
		int n;
		int j;
		int l;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}


		l = str.length();
		for (i = 0;i < l;i++)
		{
			n = 1;
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{

				for (j = i + 1;j < l;j++)
				{
					if (str.charAt(j) == str.charAt(i))
					{
						n++;
						str = tangible.StringFunctions.changeCharacter(str, j, '.');
					}
					else
					{
						continue;
					}
				}

				s[k].cha = str.charAt(i);
				s[k].num = n;
				k++;
			}

		}

		for (i = 0;i < k - 1;i++)
		{
			n = i;
			for (j = i + 1;j < k;j++)
			{
				if (s[j].cha < s[n].cha)
				{
					n = j;
				}
			}
			temp = s[i];
			s[i] = s[n];
			s[n] = temp;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c=%d\n",s[i].cha,s[i].num);
		}

		if (k == 0)
		{
			System.out.print("No\n");
			return 0;
		}

		return 0;
	}
}

