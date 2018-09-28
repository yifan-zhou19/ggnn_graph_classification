package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		int[] a = new int[50];
		int[] q = a;
		int num = 0;
		int i;
		c = new Scanner(System.in).nextLine();
		for (; * p != '\0'; p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				q[0] = (*p) - '0';
				p++;
				while (*p >= '0' && *p <= '9')
				{
					q[0] = q * 10 + (*(p++) - '0');
				}
				num += 1;
				q += 1;
			}
		}
		for (i = 0,q = a; i < num; i++,q++)
		{
			System.out.printf("%d\n",q[0]);
		}
	}

}
