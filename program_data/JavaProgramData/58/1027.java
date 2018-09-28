package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int judge;
		String zfc = new String(new char[81]);
		String pzfc;
		pzfc = zfc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		zfc = new Scanner(System.in).nextLine(); //??????????????????????
		for (i = 0;i < n;i++)
		{
			zfc = new Scanner(System.in).nextLine();
			j = 0;
			judge = 0;
			while (*(pzfc.Substring(j)) != '\0')
			{
				if (j == 0)
				{
					if (*(pzfc.Substring(j)) != '_' && (*(pzfc.Substring(j)) < 'A' | *(pzfc.Substring(j))>'z'))
					{
						judge = 1;
						break;
					}
				}
				else
				{
					if ((*(pzfc.Substring(j)) < 'A' || *(pzfc.Substring(j))>'z') && (*(pzfc.Substring(j)) < '0' || *(pzfc.Substring(j))>'9'))
					{
						judge = 1;
						break;
					}
				}
				j++;
			}
			if (judge != 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
	}
}

