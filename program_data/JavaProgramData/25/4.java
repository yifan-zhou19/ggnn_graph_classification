package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void fun(int[]);
		int[] num = new int[1000];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
		num[0] = 1;
		for (i = 1; i <= n; i++)
		{
			fun(num);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		for (p = num + 999; * p == 0; p--)
		{
			;
		}
		for (; p >= num; p--)
		{
			System.out.print(p);
		}
		return 0;
	}
	public static void fun(int[] num)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p = 0;
		 for (p = num; p < num + 1000; p++)
		 {
			 *p = 2 * *p;
		 }
		 for (p = num; p < num + 1000; p++)
		 {
			 if (*p > 9)
			 {
				  *p = p - 10;
				  *(p + 1) = *(p + 1) + 1;
			 }
		 }
	}
}

