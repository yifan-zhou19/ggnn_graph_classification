package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[MAX]);
	public static String s2 = new String(new char[MAX]);
	public static int[] stat1 = new int[300];
	public static int[] stat2 = new int[300];
	public static int len;

	public static int Main()
	{
		int i;
		int flag;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s1.length();
		if (s2.length() != len)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(stat1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(stat2,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < len;i++)
		{
			stat1[s1.charAt(i)]++;
			stat2[s2.charAt(i)]++;
		}
		flag = 1;
		for (i = 0;i < 300;i++)
		{
			if (stat1[i] != stat2[i])
			{
				flag = 0;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		if (flag == 1)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		return 0;
	}

}

