package <missing>;

public class GlobalMembers
{
	public static void DeleteChar(String s, char a)
	{
		int i;
		int j;
		for (i = j = 0; !s[j].equals('\0');j++)
		{
			if (!s[j].equals(a))
			{
				s[i] = s[j];
				i++;
			}
		}
		s[i] = '\0';
	}



	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		String a = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				for (k = j + 1,p = 1;a.charAt(k) != '\0';k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
						p = 0;
						DeleteChar(a, a.charAt(j));
						j--;
						break;
					}
				}
				if (p == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("no\n");
			}
		}
	}


}

