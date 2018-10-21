package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] a = new int[300];
		int k = 0;
		int i;
		int space = 0;
		int word = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		while (*p == ' ')
		{
			p++;
		}
		while (*p != '\0')
		{
			if (*p == ' ')
			{
				space++;
				word = 0;
			}
			if (space == 1)
			{
				k++;
				space++;
			}
			if (*p != ' ')
			{

				a[k]++;
				space = 0;

			}
			p++;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d\n",a[k]);
	}

}
