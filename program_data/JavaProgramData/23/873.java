package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a.Substring(n) - 1,i = 0;i < n;i++,p--)
		{
			if (*p == ' ')
			{
				for (j = 1;j <= k;j++)
				{
					System.out.printf("%c",*(p + j));
				}
				k = 0;
				System.out.print(" ");
			}
			else
			{
				k++;
				if (p == a)
				{
					for (j = 0;j < k;j++)
					{
					System.out.printf("%c",*(p + j));
					}
				}
			}
		}
	}
}
