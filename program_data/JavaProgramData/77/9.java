package <missing>;

public class GlobalMembers
{
	public static int kiss(String ch, char b, char g, int l, int i)
	{
		int boy;
		int j;
		if (!ch[i].equals(g))
		{
			boy = -1;
		}
		else
		{
			for (j = i - 1; j >= 0; j--)
			{
				if (ch[j].equals(b))
				{
					boy = j;
					ch[i] = '\0';
					ch[j] = '\0';
					break;
				}
				else
				{
					;
				}
			}
		}
		return (boy);
	}



	public static int Main()
	{
		String ch = new String(new char[5000]);
		char b;
		char g;
		int i;
		int l;
		int girl;
		int boy;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		l = ch.length();
		b = ch.charAt(0);
		for (i = 1; i < l; i++)
		{
			if (ch.charAt(i) != b)
			{
				g = ch.charAt(i);
				break;
			}
			else
			{
				;
			}
		}
		for (i = 1; i < l; i++)
		{
			boy = kiss(ch, b, g, l, i);
			if (boy == -1)
			{
				continue;
			}
			else
			{
				girl = i;
				System.out.printf("%d %d\n", boy, girl);
			}
		}
	}
}

