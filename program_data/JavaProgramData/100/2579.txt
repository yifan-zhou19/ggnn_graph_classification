package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[400]);
	 int n = 0;
	 int len;
	 int i;
	 int[] b = new int[100];
	 for (i = 0;i < 100;i++)
	 {
		 b[i] = 0;
	 }
	 s = new Scanner(System.in).nextLine();
	 len = s.length();
	 for (i = 0;i < len;i++)
	 {
	  b[s.charAt(i) - 'A']++;
	 }
	 for (i = 0;i < 26;i++)
	 {
	  if (b[i] != 0)
	  {
		  System.out.printf("%c=%d\n",'A' + i,b[i]);
	  }
		else
		{
			n++;
		}
	 }
	 for (i = 32;i < 58;i++)
	 {
	  if (b[i] != 0)
	  {
		  System.out.printf("%c=%d\n",'A' + i,b[i]);
	  }
	  else
	  {
		  n++;
	  }
	 }
	 if (n == 52)
	 {
		 System.out.print("No");
	 }
	 return 0;
	}
}
