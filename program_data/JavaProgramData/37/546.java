package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int len;
		int num;
		int tag;
		char k;
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < t;i++)
		{
			num = 1;
			tag = 1;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (j = 0;j < len;j++)
			{
				for (k = j + 1;k < len;k++)
				{
					if (str.charAt(j) == str.charAt(k) && str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
					{
						num = num + 1;
						str = tangible.StringFunctions.changeCharacter(str, k, 'A');
					}
				}
				if (num == 1 && str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
				{
					System.out.printf("%c\n",str.charAt(j));
					tag = 0;
					break;
				}
				else
				{
					num = 1;
				}
			}
			if (tag == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

