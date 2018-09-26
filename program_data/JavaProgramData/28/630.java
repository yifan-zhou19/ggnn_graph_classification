package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[1111];
		int m = 0;
		String b = new String(new char[11111]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		b = new Scanner(System.in).nextLine();
		for (p = b; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				m = m + 1;
			}
		}
		for (i = 0;i <= m;i++)
		{
			a[i] = 0;
		}
		i = 0;
		for (p = b; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				a[i] = a[i] + 1;
			}
			else if (*p == ' ' && *(p - 1) != ' ')
			{
				i = i + 1;
			}
		}
		j = i;
		System.out.printf("%d",a[0]);
		for (i = 1;i <= j;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}

}
