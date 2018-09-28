package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[30]);
	 int i;
	 int flag = 1;
	 a = new Scanner(System.in).nextLine();
	 String p = a;
	 for (i = 0;i < a.length();i++)
	 {
	 if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
	 {
		 System.out.printf("%c",*(p.Substring(i)));
		 flag = 0;
	 }
	 else if (*(p.Substring(i) + 1) >= '0' && *(p.Substring(i) + 1) <= '9' && flag == 0)
	 {
	 System.out.print("\n");
	 }
	 }
	}
}
