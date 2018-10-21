package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String p = a;
		String q = b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		int i;
		int j;
		int len;
		len = a.length();
		for (i = 0; * (q.Substring(i)) != '\0';i++)
		{
			if (*(q.Substring(i)) == p)
			{
				for (j = i;j < i + len;j++)
				{
					if (*(q.Substring(j)) != *(p.Substring(j) - i))
					{
						break;
					}
				}
			if (j == i + len)
			{
				System.out.printf("%d",i);
				break;
			}
			}
		}

	}



}

