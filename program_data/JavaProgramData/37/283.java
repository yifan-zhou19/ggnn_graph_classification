package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int k;
		int m;
		int flag;
		int already;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= num;i++)
		{
			for (j = 0;j < 99999;j++)
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
			for (k = 0;k < j;k++)
			{
				flag = 1;
				already = 0;
				for (m = 0;m < j;m++)
				{
					if (a.charAt(m) == a.charAt(k) && m != k)
					{
						flag *= 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.printf("%c\n",a.charAt(k));
					already = 1;
					break;
				}
			}
			if (already == 0)
			{
					System.out.print("no\n");
			}
		}
		return 0;
	}
}

