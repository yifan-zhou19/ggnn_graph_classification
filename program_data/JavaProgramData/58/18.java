package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			p = new Scanner(System.in).nextLine();
			y = 1;
			for (p = q,j = 0; * (p.Substring(j)) != '\0';j++)
			{
				if (j == 0)
				{
					if ((*(p.Substring(j)) < 'a' || *(p.Substring(j))>'z') && (*(p.Substring(j)) < 'A' || *(p.Substring(j))>'Z') && *(p.Substring(j)) != '_')
					{
						y = 0;
						break;
					}
				}
				if (j != 0)
				{
					if ((*(p.Substring(j)) < 'a' || *(p.Substring(j))>'z') && (*(p.Substring(j)) < 'A' || *(p.Substring(j))>'Z') && *(p.Substring(j)) != '_' && (*(p.Substring(j)) < '0' || *(p.Substring(j))>'9'))
					{
						y = 0;
						break;
					}
				}
			}
			System.out.printf("%d%s",y,i == n - 1?"":"\n");
		}
	}

}

