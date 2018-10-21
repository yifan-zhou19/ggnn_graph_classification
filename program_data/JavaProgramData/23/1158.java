package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[110]);
		int n;
		int i;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
			*(str.Substring(i) + 1) = *(str.Substring(i));
		}
		*str = (str.Substring(n) + 1) = ' ';
		for (i = n - 1;i >= 0;i--)
		{
		if (*(str.Substring(i)) == ' ')
		{
			for (p = str.Substring(i) + 1; * p != ' ';p++)
			{
			 System.out.printf("%c",*p);
			}
		if (i != 0)
		{
			System.out.print(" ");
		}
		}
		}
	}
}
