package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String str = new String(new char[100]);
		String p;
		char c;
		p = str;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			k = 1;
			for (j = 0; * (p.Substring(j)) != '\0';j++)
			{
				c = (p.Substring(j));
				if (j == 0)
				{
					if ((c < 'a' || c>'z') && (c < 'A' || c>'Z') && c != '_')
					{
						k = 0;
						break;
					}
				}
				if (j != 0)
				{
					if ((c < 'a' || c>'z') && (c < 'A' || c>'Z') && c != '_' && (c < '0' || c>'9'))
					{
						k = 0;
						break;
					}
				}
			}
			System.out.printf("%d%s",k,i == n - 1?"":"\n");
		}
	}


}

