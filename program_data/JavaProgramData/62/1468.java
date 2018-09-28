package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String s = new String(new char[100]);
	 int i;
	 int j;
	 s = new Scanner(System.in).nextLine();
	 String p = s;
	 for (i = 0;i < s.length();)
	 {
	 if (*(p.Substring(i)) == ' ' && *(p.Substring(i) - 1) == ' ')
	 {
		 for (j = i;j < s.length();j++)
		 {
	   *(p.Substring(j)) = *(p.Substring(j) + 1);
		 }
	 }
	 else
	 {
		 i++;
	 }
	 }
	 for (i = 0;i < s.length();i++)
	 {
	 System.out.printf("%c",*(p.Substring(i)));
	 }
	}
}
