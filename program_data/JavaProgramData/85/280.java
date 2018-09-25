package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String a = new String(new char[21]);
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
				a = tempVar2.charAt(0);
			}
			j = 0;
			t = 0;
			while (a.charAt(j) != '\0')
			{
				if (!((a.charAt(j) == '_') || ((a.charAt(j) <= 'z') && (a.charAt(j) >= 'a')) || ((a.charAt(j) <= 'Z') && (a.charAt(j) >= 'A')) || ((a.charAt(j) <= '9') && (a.charAt(j) >= '0'))))
				{
					t = 1;
				}
				j++;
			}
			t = t + ((a.charAt(0) <= '9') && (a.charAt(0) >= '0'));
			if (t == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}

