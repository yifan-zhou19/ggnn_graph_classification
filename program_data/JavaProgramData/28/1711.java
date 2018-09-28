package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
		int n;
		int[] num = new int[128];
		int i = 0;
		int j;
		int k = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();

		for (p = str; * p != '\0';p++)
		{
			if (*(p - 1) == ' ' && *p != ' ')
			{
				k++;
			}
		}

		for (p = str; * p != '\0';p++)
		{
			if (*p != ' ' && i == 0)
			{
				num[0]++;
				continue;
			}
			if (*p != ' ')
			{
				num[i]++;
			}
			if (*p == ' ' && *(p + 1) != ' ')
			{
				i++;
			}
		}

		for (j = 0;j < k - 1;j++)
		{
			System.out.printf("%d,",num[j]);
		}
		System.out.printf("%d",num[j]);

	}


}
