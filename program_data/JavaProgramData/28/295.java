package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int s;
	 String a = new String(new char[1000]);
	 String p;
	 p = a;
	 a = new Scanner(System.in).nextLine();
	 s = 0;
	 for (i = 0;i <= a.length() - 1;i++)
	 {
	  if (*(p.Substring(i)) != ' ')
	  {
	   s++;
	  }
	  else
	  {
		if (*(p.Substring(i) - 1) != ' ')
		{
	   System.out.printf("%d,",s);
	   s = 0;
		}
	  }
	 }
	 System.out.printf("%d",s);
	}
}
