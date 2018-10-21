package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int[] m = new int[1000];
		int[] n = new int[1000];
		String s = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps = s;
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		for (i = 0,j = 1; * ps != '\0';ps++,i++)
		{
			if (*ps == ' ')
			{
				m[j] = i;
				j++;
			}
		}
		m[0] = -1;
		m[j] = l;
		for (i = 0;i < j - 1;i++)
		{
			n[i] = m[i + 1] - m[i] - 1;
			if (n[i] == 0)
			{
				continue;
			}
			System.out.printf("%d,",n[i]);
		}
		n[i] = m[i + 1] - m[i] - 1;
		System.out.printf("%d",n[i]);
		return 0;
	}
}
