package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//????????????? 
	//?????????????
	//??????
	//***********************************************************************
	public static void out1(int n, String a)
	{
		 char temp;
		 int c;
		 if (n == 1)
		 {
			  System.out.print(a);
			  System.out.print("\n");
		 }
		 else
		 {
		 for (int i = n - 1; i >= 0; i--)
		 {
				 if (!a[i].equals('0'))
				 {
						   c = i;
						   break;
				 }
		 }
		 for (int j = c; j >= 0; j--)
		 {
				 System.out.print(a[j]);
		 }
		 System.out.print("\n");
		 }
	}
	public static void out2(int n, String a)
	{
		 char temp;
		 int c;
		 if (n == 2)
		 {
			  System.out.print(a[1]);
			  System.out.print("\n");
		 }
		 else
		 {
		 for (int i = n - 1; i > 0; i--)
		 {
				 if (!a[i].equals('0'))
				 {
						   c = i;
						   break;
				 }
		 }
		 for (int j = c; j > 0; j--)
		 {
				 System.out.print(a[j]);
		 }
		 System.out.print("\n");
		 }
	}
	public static int Main() //???
	{
		int n;
		String str = new String(new char[100]);
		for (int i = 0; i < 6; i++)
		{
				str = ConsoleInput.readToWhiteSpace(true).charAt(0);
				n = str.length();
				if (str.charAt(0) == '-')
				{
						  System.out.print(str.charAt(0));
						  out2(n, str);
				}
				else
				{
					out1(n, str);
				}
		}
				return 0;
	}



}

