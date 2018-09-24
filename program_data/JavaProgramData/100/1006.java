package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		char str2;
		int num = 0;
		int len;
		int j;
		int i;
		int examine = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 97;i <= 122;i++)
		{
			str2 = i;
			for (j = 0;j < len;j++)
			{
				if (str.charAt(j) == str2)
				{
					num++;
					examine++;
				}
			}


			if (num == 0)
			{
				continue;
			}
			if (examine != 0)
			{
				System.out.printf("%c=%d\n",str2,num);
			}
			num = 0;
		}
		if (examine == 0)
		{
				System.out.print("No\n");
		}
		return 0;
	}

}

