package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int s;
		int k;
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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			j = i;
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				s = j;
				for (k = 0;k < j;k++)
				{
					if (b.charAt(i + k) == a.charAt(k))
					{
						s = s - 1;
					}
				}
				if (s == 0)
				{
					System.out.printf("%d\n",i);
					break;
				}

			}
		}
	}
}

