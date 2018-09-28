package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[233333]);
		for (k = 0;k < n;k++)
		{
			int[] b = new int[233333];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				for (j = 0;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
					b[i]++;
					}
				}
			}
			j = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (b[i] == 1)
				{
					j = 1;
					break;
				}
			}
			if (j == 0)
			{
				System.out.print("no\n");
			}
			else
			{
			System.out.printf("%c\n",a.charAt(i));
			}
		}
	}
}

