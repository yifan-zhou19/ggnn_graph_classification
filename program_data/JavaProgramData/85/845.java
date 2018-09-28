package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;
		int flag1 = 0;
		int j;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if ((a.charAt(0) == 95) || (a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122))
			{
				flag = 1;
			}
			else
			{
				System.out.print("no\n");
			}

			if (flag == 1)
			{
				for (i = 1;i < a.length();i++)
				{
					if ((a.charAt(i) == 95) || (a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122) || (a.charAt(i) >= 48 && a.charAt(i) <= 57))
					{
						flag1 = 1;
					}
					else
					{
						System.out.print("no\n");
						flag1 = 2;
						break;
					}
				}
				if (flag1 == 1)
				{
					System.out.print("yes\n");
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'0',(Character.SIZE / Byte.SIZE));
			i = 0;
			flag = 0;
			flag1 = 0;
		}
		return 0;
	}


}

