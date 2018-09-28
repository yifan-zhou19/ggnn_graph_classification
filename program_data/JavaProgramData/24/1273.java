package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int i;
	public static int[] num = new int[100];
	public static int t = 0;
	public static int max = 0;
	public static int min = 50;
	public static int begin = 0;
	public static int lon1 = 0;
	public static int lon2;
	public static int sho1 = 0;
	public static int sho2;
	public static String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * p;

	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		p = s;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				num[t]++;
			}
			else
			{

				if (num[t] > max)
				{
					max = num[t];
					lon1 = begin;
					lon2 = n - 1;
				}
				if (num[t] < min)
				{
					min = num[t];
					sho1 = begin;
					sho2 = n - 1;
				}
				begin = n + 1;
				t++;
			}
			n++;
			p++;
		}
		if (*p == '\0')
		{
			if (num[t] > max)
			{
					max = num[t];
					lon1 = begin;
					lon2 = n - 1;
			}
				if (num[t] < min)
				{
					min = num[t];
					sho1 = begin;
					sho2 = n - 1;
				}
		}

		for (i = lon1;i < lon2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.printf("%c\n",s.charAt(lon2));
		for (i = sho1;i < sho2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.printf("%c\n",s.charAt(sho2));
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	return 0;
	}

}

