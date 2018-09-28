package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[10000]);
		int[] a = new int[10000];
		int i = 0;
		int j = 0;
		int[] b = new int[10000];
		int t = 0;
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				i++;
			}
			else
			{
				a[i]++;
			}
		}
		for (j = 0;j < 1000;j++)
		{
			if (a[j] != 0)
			{
				b[t] = a[j];
				t++;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < t;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}

}
