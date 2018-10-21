public class Str
{
	public int start;
	public int end;
	public int len;
}

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[510]);
	public static int num = 0;
	public static int k = 0;
	public static int len;
		public static Str[] str = tangible.Arrays.initializeWithDefaultStrInstances(30010);
	public static void run()
	{
		int a = k;
		int b = num;
		k = num;
		int k1;
		int k2;
		for (int i = a;i < b;i++)
		{
			k1 = str[i].start - 1;
			k2 = str[i].end + 1;
			if (k1 >= 0 && k2 < len && s.charAt(k1) == s.charAt(k2))
			{
				str[num].start = k1;
				str[num].end = k2;
				str[num++].len = k2 - k1;
			}
		}
	}
	public static int Main()
	{
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s.length();
		//??????? 
		for (int i = 0;i < len - 1;i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				str[num].start = i;
				str[num].end = i + 1;
				str[num++].len = str[i].start - str[i].end;
			}
		}
		k = 0;
		//????????????????????????? 
		while (k < num)
		{
			run();
		}
		for (int i = 0;i < num;i++)
		{
			for (int j = str[i].start;j <= str[i].end;j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

