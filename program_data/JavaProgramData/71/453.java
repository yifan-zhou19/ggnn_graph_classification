package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] judge = new int[100];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(judge,0,(Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int year;
			int month1;
			int month2;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (month1 > month2)
			{
				int temp = month1;
				month1 = month2;
				month2 = temp;
			}
			int day = 0;
			int j;

			if (month1 == month2)
			{
				day = 0;
			}
			else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				for (j = month1;j < month2;j++)
				{
					day += b[j];
				}
			}
			else
			{
				for (j = month1;j < month2;j++)
				{
					day += a[j];
				}
			}
			if (day % 7 == 0)
			{
				judge[i] = 1;
			}
			else
			{
				judge[i] = 0;
			}


		}
		for (i = 1;i <= n;i++)
		{

			if (judge[i] == 1)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}


		return 0;
	}

}

