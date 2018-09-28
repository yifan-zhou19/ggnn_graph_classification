package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		char[][] s = new char[500][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (p = s[i];p < s[i] + String.valueOf(s[i]).length();p++)
			{
			System.out.printf("%c",*p);
			}
			sum += String.valueOf(s[i]).length() + 1;
			if (sum + String.valueOf(s[i + 1]).length() > 80)
			{
				System.out.print("\n");
				sum = 0;
			}
			else
			{
				System.out.print(" ");
			}
		}
		for (p = s[n - 1];p < s[n - 1] + String.valueOf(s[n - 1]).length();p++)
		{
		System.out.printf("%c",*p);
		}
		return 0;
	}
}

