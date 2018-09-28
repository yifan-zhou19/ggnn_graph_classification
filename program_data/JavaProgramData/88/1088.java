package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		int[] a = new int[50];
		int[] q = a;
		int t = 0;
		int i;
		c = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				q[0] = (*p) - '0';
				p++;
				while (*p >= '0' && *p <= '9')
				{
					q[0] = q * 10 + (*(p++) - '0');
				}
				t++;
				q++;
			}
		}
		for (i = 1,q = a;i <= t;i++,q++)
		{
			System.out.printf("%d\n",q[0]);
		}
		return 0;
	}

}
