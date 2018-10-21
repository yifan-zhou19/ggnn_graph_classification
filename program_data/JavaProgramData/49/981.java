package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static char[][] s1 = new char[100][100];
	public static int flag = 0;
	public static void f(char x, char y)
	{
		String p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		if (x >= 1 && s.charAt(y + 1) != '\0')
		{
			if (s.charAt(x - 1) == s.charAt(y + 1))
			{
				p2 = s.charAt(y + 1);
				for (p = s.charAt(x - 1),i = 0;p <= p2;p++,i++)
				{
				s1[flag][i] = p;
				}
				flag++;
				f(x - 1, y + 1);
			}
		}
	}
	public static int Main()
	{
		int i;
		int[] len = new int[100];
		int k;
		int j;
		int temp;
		String s2 = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		for (i = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i - 1) == s.charAt(i))
			{
				s1[flag][0] = s.charAt(i - 1);
				s1[flag][1] = s.charAt(i);
				flag++;
				f(i - 1, i);
			}
		}
		k = flag;
		for (i = 0;i < k;i++)
		{
		len[i] = String.valueOf(s1[i]).length();
		}
		for (i = 0;i < k;i++)
		{
			for (j = 1;j < k - i;j++)
			{
				if (len[j - 1] > len[j])
				{
					temp = len[j - 1];
					len[j - 1] = len[j];
					len[j] = temp;
					s2 = s1[j - 1];
					s1[j - 1] = s1[j];
					s1[j] = s2;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%s\n",s1[i]);
		}

	}
}
