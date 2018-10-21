package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[MAX]);
		char c;
		int i;
		int num;
		int flg;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		flg = 0;
		for (i = 0;;i++)
		{

			if ((i != 0) && (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) == str.charAt(i - 1) - 32 || str.charAt(i) == str.charAt(i - 1) + 32))
			{
					num = num + 1;
			}
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
					if (flg != 0)
					{
						System.out.printf("(%c,%d)",c,num);
					}
					flg = 1;
					c = str.charAt(i);
					num = 1;
			}
					else
					{
						if (flg != 0)
						{
							System.out.printf("(%c,%d)",c,num);
						}
						flg = 1;
						c = str.charAt(i) - 32;
						num = 1;
					}
			if (str.charAt(i) == '\0')
			{
				break;
			}
		}
	}
}

