package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s;
		int[] num = new int[300];
		int i = 0;
		int k = 0;
		int m = 0;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				num[i] = num[i] + 1;
				k = 1;
			}
			else if (*p == ' ' && k == 1)
			{
				i = i + 1;
				k = 0;
				m = i;
			}
			p = p + 1;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d,",num[i]);
		}
		System.out.printf("%d",num[m]);
	return 0;
	}
}
