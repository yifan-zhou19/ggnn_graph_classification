package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int d;
		int result = 0;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 31, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			a[2] = a[2] + 1;
			for (i = 1;i < month;i++)
			{
				result += a[i];
			}
			result += d;
		}
		else
		{
					 for (i = 1;i < month;i++)
					 {
				result += a[i];
					 }
		}
			result += d;
		System.out.printf("%d\n",result);

	}
}

