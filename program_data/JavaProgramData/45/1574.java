package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					if (b[i + j] = a.charAt(j) != null)
					{
						k++;
					}
					if (a.charAt(k) == '\0')
					{
						System.out.printf("%d\n",i);
						break;
					}
				}
			}
		}
		return 0;
	}

}

