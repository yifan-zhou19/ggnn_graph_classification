package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int k;
		int flag;
		String a = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < 81;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, tempVar2);
				}
				if (a.charAt(j) == '\n')
				{
					break;
				}
			}

			if ((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				flag = 1;
				for (k = 1;k < j;k++)
				{
					if ((a.charAt(k) == '_') || (a.charAt(k) >= '0' && a.charAt(k) <= '9') || (a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z'))
					{
						flag *= 1;
					}
					else
					{
						flag *= 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

