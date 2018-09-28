package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[3000]);
	 s = new Scanner(System.in).nextLine();
	 int count = 0;
	 int i;
	 int len;
	 for (i = 0;;i++)
	 {
	  if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
	  {
		  count++;
	  }
	   else
	   {
		  break;
	   }
	 }
	 System.out.printf("%d",count);
	 len = s.length();
	 if (s.charAt(i) == '\0')
	 {
		  return 0;
	 }
	 count = 0;
	 for (;i <= len;i++)
	 {
		if (s.charAt(i) != ' ' && (s.charAt(i + 1) == ' ' || s.charAt(i + 1) == '\0'))
		{
			count++;
			System.out.printf(",%d",count);
			count = -1;
		}
		if (s.charAt(i) == ' ')
		{
			 continue;
		}
		if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		{
			count++;
		}
		if (s.charAt(i + 1) == '\0')
		{
			 break;
		}
	 }
	 return 0;
	}
}
