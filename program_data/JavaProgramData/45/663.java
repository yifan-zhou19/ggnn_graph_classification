package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i = 0;
		int j = 0;
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
		while (b.charAt(j) != '\0')
		{
			if (a.charAt(0) == b.charAt(j))
			{
				for (i = 0;a.charAt(i) != '\0';i++)
				{
					if (a.charAt(i) != b.charAt(i + j))
					{
						break;
					}
				}
				if (a.charAt(i) == '\0')
				{
					System.out.printf("%d\n",j);
					break;
				}
				else
				{
					j++;
				}
			}
			else
			{
				j++;
			}
		}
	}

}

