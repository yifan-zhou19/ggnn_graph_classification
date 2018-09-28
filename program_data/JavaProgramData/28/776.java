package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
	 String p;
	 String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
	 p = new Scanner(System.in).nextLine();
	 s = p;
	 n = p.length();
	 *(p.Substring(n)) = ' ';
	 for (k = 0,i = 0;i <= n;i++)
	 {
		 if (*(s.Substring(i)) == ' ' && *(s.Substring(i) - 1) != ' ')
		 {
	  if (i == n)
	  {
		  System.out.printf("%d",k);
		  k = 0;
	  }
	  else
	  {
		  System.out.printf("%d,",k);
		  k = 0;
	  }
		 }
	  if (*(s.Substring(i)) != ' ')
	  {
		  k++;
	  }
	 }
	}
}
