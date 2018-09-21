package <missing>;

public class GlobalMembers
{
	//?????????//
	public static String cnum = new String(new char[100]);
	public static int[] inum = new int[100];
	public static int cal()
	{
		int i;
		for (i = 0; i < 100; i++)
		{
			inum[i] = cnum.charAt(i) - '0';
		}
		for (i = 0; i < 100; i++)
		{
			inum[i] *= 2;
		}
		for (i = 0; i < 100; i++)
		{
			if (inum[i] >= 10)
			{
				inum[i] -= 10;
				inum[i + 1]++;
			}
		}
		for (i = 0; i < 100; i++)
		{
			cnum = tangible.StringFunctions.changeCharacter(cnum, i, inum[i] + '0');
		}
		for (i = 99; i >= 0; i--)
		{
			if (inum[i] != 0)
			{
				break;
			}
		}
		return i;
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(cnum, '0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(inum, 0, (Integer.SIZE / Byte.SIZE));
		cnum = tangible.StringFunctions.changeCharacter(cnum, 0, '1');
		int len;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
			return 1;
		}
		for (int i = 1; i <= n; i++)
		{
			len = cal();
		}
		for (int i = len; i >= 0; i--)
		{
			System.out.print(cnum.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

