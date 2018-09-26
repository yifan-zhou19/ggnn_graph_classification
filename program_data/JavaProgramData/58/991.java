package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String p;
		String p0;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = p0 = (String)malloc(100 * 100 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			p = new Scanner(System.in).nextLine();
			k = 1;
			for (p = p0,j = 0; * (p.Substring(j)) != '\0';j++)
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

