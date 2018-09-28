package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n = 1;
		int[] num = new int[50];
		int max;
		int min;
		int max1;
		int max2;
		int min1;
		int min2;
		int i;
		a = new Scanner(System.in).nextLine();
		for (p = a; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				num[n] = p - a;
				n++;
			}
		}
		num[0] = -1;
		num[n] = a.length();
		max = num[1] - num[0];
		min = num[1] - num[0];
		max1 = num[0];
		max2 = num[1];
		min1 = num[0];
		min2 = num[1];
		for (i = 1;i < n;i++)
		{
			if (num[i + 1] - num[i] > max)
			{
				max1 = num[i];
				max2 = num[i + 1];
				max = max2 - max1;
			}
			if (num[i + 1] - num[i] < min)
			{
				min1 = num[i];
				min2 = num[i + 1];
				min = min2 - min1;
			}
		}
		for (p = a.Substring(max1) + 1;p < a.Substring(max2);p++)
		{
			System.out.printf("%c",*p);
		}
		System.out.print("\n");
		for (p = a.Substring(min1) + 1;p < a.Substring(min2);p++)
		{
			System.out.printf("%c",*p);
		}
		System.out.print("\n");
		return 0;
	}
}
