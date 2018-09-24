package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 97;i < 123;i++)
		{
			for (j = 0,p = a;(*p) != '\0';p++)
			{
			if ((*p) == i)
			{
				j++;
			}
			}
		if (j != 0)
		{
			System.out.printf("%c=%d\n",i,j);
			m++;
		}
		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
	}
}
