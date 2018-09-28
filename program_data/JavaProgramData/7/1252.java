package <missing>;

public class GlobalMembers
{
	public static int comp(String a, String b, int i)
	{
		int l;
		int j;
		l = b.length();
		for (j = 0;j < l;j++)
		{
			if (!a[i + j].equals(b[j]))
			{
				return 0;
			}
		}
			return 1;
	}


	public static void Main(String[] args)
	{
		int i;
		int j;
		int len1;
		int len2;
		int len3;
		int break1 = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int comp = new int(char a.charAt(100),char b.charAt(100),int i);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		len3 = c.length();
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				if (comp(a, b, i) != 0)
				{
					for (j = 0;j < i;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					System.out.printf("%s",c);

					for (j = j + len2;j < len1 - len2 + len3;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					break;
					break1 = 1;
				}
			}
			if (break1 == 1)
			{
				break;
			}
			if (i == a.length())
			{
				System.out.printf("%s",a);
			}
		}

	}

}

