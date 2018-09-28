package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char d = 0;
		int[] b = new int[400];
		int i = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		p = a;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
			b[i] = b[i] + 1;
			p++;
			d = 1;
			}
			else if (*p == ' ')
			{
				if (d == 1)
				{
					i++;
					d = 0;
				}
				if (*p != '\0')
				{
					p++;
				}
			}
		}
		System.out.printf("%d",b[0]);
		if (b[i] > 0)
		{
		for (j = 1;j <= i;j++)
		{
			System.out.printf(",%d",b[j]);
		}
		}
		else if (b[i] == 0)
		{
			for (j = 1;j < i;j++)
			{
				System.out.printf(",%d",b[j]);
			}
		}

	}






}
