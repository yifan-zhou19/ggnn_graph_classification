package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		int[] num = new int[300];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int x = 0;
		str = new Scanner(System.in).nextLine();
		p = num;
		for (i = 0;i < 300;i++)
		{
			num[i] = 0;
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) != ' ')
			{
				*p = p + 1;
				x = 0;
			}
			else if (x == 0)
			{
				p++;
				x = 1;
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;num[i] != 0;i++)
		{
			System.out.printf(",%d",num[i]);
		}
	}
}
