package <missing>;

public class GlobalMembers
{
	//????
	public static void shan(String str)
	{
		int n;
		n = str.length(); //???????
		if (str[n - 1].equals('r'))
		{
			str[n - 2] = '\0';
		}
		else
		{
			if (str[n - 1].equals('y'))
			{
			str[n - 2] = '\0';
			}

			else
			{
			str[n - 3] = '\0';
			}
		}
		System.out.printf("%s\n",str);
	}

	public static void Main()
	{
		int a;
		int i;
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			shan(str);
		}
	}

}

