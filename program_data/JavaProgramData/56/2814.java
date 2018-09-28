package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	void nixu(char a[]);
	 int i;
	 String a = new String(new char[10]);
	 char c;
	 char n;
	 a = new Scanner(System.in).nextLine();
	 nixu(a);
	}
	 public static void nixu(String a)
	 {
		 int m = 0;
		 int i;
		 char c;
	  if (a.length() == 1)
	  {
		  System.out.printf("%s",a);
	  }
	  else
	  {
			m = a.length();
			c = a[m - 1];
				for (i = m - 1;i >= 1;i--)
				{

					   a[i] = a[i - 1];
				}
					   a[0] = c;

					System.out.printf("%c",a[0]);
				for (i = 0;i < m - 1;i++)
				{
				a[i] = a[i + 1];
				}
				a[m - 1] = '\0';
		nixu(a);
	  }
	 }
}
