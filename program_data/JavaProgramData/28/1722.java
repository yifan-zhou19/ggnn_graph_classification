package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[10000]);
		int i;
		int k = 0;
		int q = 0;
		int[] n = new int[1000];
		x = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (p = x; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				k++;
				if ((*(p + 1) == ' ') || (*(p + 1) == '\0'))
				{
					n[q] = k;
					k = 0;
					q++;
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (((n[i]) != 0) && ((n[i + 1]) != 0))
			{
				System.out.printf("%d,",(n[i]));
			}
			if (((n[i]) != 0) && ((n[i + 1]) == 0))
			{
				System.out.printf("%d",(n[i]));
			}
		}
		return 0;
	}


}
