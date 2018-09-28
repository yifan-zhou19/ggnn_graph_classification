package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int judge;
		int i;
		int all;
		int p;
		String input = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		for (p = 0;p < all;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			judge = 0;
			if (input.charAt(0) >= 'a' && input.charAt(0) <= 'z')
			{
				judge = 1;
			}
			if (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z')
			{
				judge = 1;
			}
			if (input.charAt(0) == '_')
			{
				judge = 1;
			}
			if (input.charAt(0) >= '9' && input.charAt(0) <= '1')
			{
				judge = 0;
			}
			if (input.charAt(0) == '0')
			{
				judge = 0;
			}
			if (judge == 0)
			{
				System.out.print("no\n");
				continue;
			}
			for (i = 1;i < len;i++)
			{
				judge = 0;
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
				{
					judge = 1;
				}
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
				{
					judge = 1;
				}
				if (input.charAt(i) >= '1' && input.charAt(i) <= '9')
				{
					judge = 1;
				}
				if (input.charAt(i) == '0')
				{
					judge = 1;
				}
				if (input.charAt(i) == '_')
				{
					judge = 1;
				}
				if (judge == 0)
				{
					System.out.print("no\n");
					break;
				}



			}
		if (judge == 0)
		{
			continue;
		}
		System.out.print("yes\n");



		}


	return 0;
	}



}

