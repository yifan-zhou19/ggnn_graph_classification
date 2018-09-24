package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		char c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] b = new int[1000];
		int i;
		int j;
		int n;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a;p < a.Substring(n);p++)
		{

			if (*p == ' ')
			{
				m = m + 1;
			}
		}
		j = 0;
		for (i = 0;i <= m;i++)
		{
			b[i] = 0;
		}
		for (p = a;p < a.Substring(n);p++)
		{

			if (*p == ' ')
			{
				j++;
				continue;
			}
			else
			{
				b[j] = b[j] + 1;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= m;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf(",%d",b[i]);
			}
		}




	}


}
