package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String ba = new String(new char[m]);
		for (j = 0;j < m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ba = tempVar2.charAt(0);
		}
		for (i = 0;ba.charAt(i) != '\0';i++)
		{
			if (i == 0)
			{
				if (!((ba.charAt(i) >= 'a' && ba.charAt(i) <= 'z') || (ba.charAt(i) >= 'A' && ba.charAt(i) <= 'Z') || ba.charAt(i) == '_'))
				{
					System.out.print("no\n");
					  break;
				}
			}
			if (i != 0)
			{
				if (!((ba.charAt(i) >= 'a' && ba.charAt(i) <= 'z') || (ba.charAt(i) >= 'A' && ba.charAt(i) <= 'Z') || (ba.charAt(i) >= '0' && ba.charAt(i) <= '9') || ba.charAt(i) == '_'))
				{
					System.out.print("no\n");
					break;
				}
			}
			if (ba.charAt(i + 1) == '\0')
			{
				System.out.print("yes\n");
			}
		}
		}
		return 0;
	}
}

