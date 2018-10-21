package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[2000]);
		int[] num1 = new int[300];
		int i = 0;
		int num2 = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		do
		{
			if (*p == ' ')
			{
				if (*(p - 1) == ' ')
				{
					p++;
				}
				else
				{
					p++;
					i++;
					num2++;
				}
			}
			else if (*p != ' ')
			{
				num1[i]++;
				p++;
			}
			if (*p == '\0')
			{
				if (*(p - 1) == ' ')
				{
				break;
				}
				else if (*(p - 1) != ' ')
				{
					num2++;
				}
			}
		}while (*p != '\0');
		for (i = 0;i < num2;i++)
		{
			System.out.printf("%d",num1[i]);
			if (i != num2 - 1)
			{
				System.out.print(",");
			}
		}
	}
}
