package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int flag = 0;
		int i;
		int j;
		int len;
		int[] c = {'0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
		len = a.length();
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
				for (j = 0;j < len;j++)
				{
					if (c[j] == 0)
					{
						if (a.charAt(i) == b.charAt(j))
						{
							c[j] = 1;
							break;
						}
					}
				}
			}
			for (j = 0;j < len;j++)
			{
				if (c[j] == 0)
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}

		}


	}


}

