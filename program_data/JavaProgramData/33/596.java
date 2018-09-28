package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] a = new char[9999][256];
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}

		}
				 for (i = 0;i < n;i++)
				 {
			for (p = a[i]; p != '\0';p++)
			{
				if (p == 'A')
				{
					p = 'T';
				}
					else if (p == 'C')
					{
						p = 'G';
					}
						else if (p == 'G')
						{
							p = 'C';
						}
				else if (p == 'T')
				{
					p = 'A';
				}
			}
				 }
		for (i = 0;i < n;i++)
		{
		System.out.println(a[i]);
		}


		return 0;
	}

}

