package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[128]);
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * string;
		String p;
		String temp;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		string = str;
		string = string + n - 1;
		p = str.Substring(n);
		for (i = n;i > 0;i--,string--)
		{
			if ((*string) == ' ')
			{
				temp = String;
				{
				for (string = string + 1;string != p;string++)
				{
			System.out.printf("%c",*string);
				}
				}
			System.out.print(" ");
			p = temp;
			string = temp;
			}
		}
		for (string = str;string != p;string++)
		{
			System.out.printf("%c",*string);
		}





	}
}
