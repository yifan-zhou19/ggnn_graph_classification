package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an1 = new int[250];
		int[] an2 = new int[250];
		String s1 = new String(new char[251]); //????????????
		String s2 = new String(new char[251]);
		int l1;
		int l2;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = s1.length();
		l2 = s2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0,(Integer.SIZE / Byte.SIZE));
		int i = 0;
		int j = 0;
		for (i = l1 - 1;i >= 0;i--) //?????????
		{
			an1[j++] = s1.charAt(i) - '0';
		}
		j = 0;
		for (i = l2 - 1;i >= 0;i--)
		{
			an2[j++] = s2.charAt(i) - '0';
		}
		for (i = 0; i < 250 ;i++)
		{
			an1[i] += an2[i];
			if (an1[i] >= 10) //???
			{
				an1[i] -= 10;
				an1[i + 1]++;
			}
		}
		i = 249;
		while (an1[i] == 0 && i > 0)
		{
			i--; //???????0??
		}
		if (i == 0)
		{
			System.out.print(an1[0]);
			System.out.print("\n");
		}
		else
		{
			for (;i >= 0; i--)
			{
			System.out.print(an1[i]);
			}
		System.out.print("\n");
		}
		return 0;
	}


}

