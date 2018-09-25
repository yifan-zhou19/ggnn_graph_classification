package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[21]);
		int[] yn = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			yn[i] = 1;
		}
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
				s = tempVar2.charAt(0);
			}
			if ((s.charAt(0) != '_') && (s.charAt(0) < 'A' || s.charAt(0)>'Z') && (s.charAt(0) < 'a' || s.charAt(0)>'z'))
			{
				yn[i] = 0;
			}
			else
			{
				for (j = 0;s.charAt(j);j++)
				{
					if ((s.charAt(j) != '_') && (s.charAt(j) < 'A' || s.charAt(j)>'Z') && (s.charAt(j) < 'a' || s.charAt(j)>'z') && (s.charAt(j) < '0' || s.charAt(j)>'9'))
					{
						yn[i] = 0;
					}

				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (yn[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

