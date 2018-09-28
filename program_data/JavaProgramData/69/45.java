package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[200];
	public static int[] b = new int[200];
	public static int[] out = new int[200];
	public static void init()
	{
		 for (int i = 0;i < 200;i++)
		 {
				 a[i] = 0;
				 b[i] = 0;
				 out[i] = 0;
		 }
	}
	public static void load()
	{
		 String temp = new String(new char[201]);
		 temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 int begin = 200 - temp.length();
		 for (int i = 0;i < temp.length();i++)
		 {
				 a[begin + i] = temp.charAt(i) - '0';
		 }
		 temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 begin = 200 - temp.length();
		 for (int i = 0;i < temp.length();i++)
		 {
				 b[begin + i] = temp.charAt(i) - '0';
		 }
	}
	public static void add()
	{
		 int carry = 0;
		 int i = 0;
		 for (i = 199;i >= 0;i--)
		 {
				 out[i] = a[i] + b[i] + carry;
				 if (out[i] >= 10)
				 {
					 out[i] -= 10;
					 carry = 1;
				 }
				 else
				 {
					 carry = 0;
				 }
		 }
		 for (i = 0;i < 199;i++)
		 {
			 if (out[i] != 0)
			 {
			 break;
			 }
		 }
		 for (;i < 200;i++)
		 {
			 System.out.print(out[i]);
		 }
		 System.out.print("\n");
	}
	public static int Main()
	{
		init();
		load();
		add();
		return 0;
	}
}

