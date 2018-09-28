package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String p;
	 int i;
	 int j;
	 int k;
	 int n;
	 int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	 p = new Scanner(System.in).nextLine();
	 n = p.length();
	 for (i = 0;i < n - 2;i++)
	 {
		 System.out.printf("%c",*(p.Substring(i)));
		 if (*(p.Substring(i) + 2) == ' ' && *(p.Substring(i) + 1) == ' ')
		 {
			while (*(p.Substring(i) + 2) == ' ')
			{
				  i++;
			}
		 }
	 }
		System.out.printf("%c%c",*(p.Substring(n) - 2),*(p.Substring(n) - 1));
	}
}
