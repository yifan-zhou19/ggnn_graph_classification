package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int flag;
		int flag1 = 0;
		int t;
		String a = new String(new char[100]);
		char s;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t = Integer.parseInt(tempVar);
			}
		for (i = 1;i <= t;i++)
		{
					flag1 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				s = a.charAt(j);
				flag = 0;
				for (k = 0;a.charAt(k) != '\0';k++)
				{
					if ((a.charAt(j) == a.charAt(k)) && (k != j))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%c\n",s);
					flag1 = 1;
					break;
				}

			}
			if (flag1 == 0)
			{
			System.out.print("no\n");
			}
		}
		return 0;
	}

}

