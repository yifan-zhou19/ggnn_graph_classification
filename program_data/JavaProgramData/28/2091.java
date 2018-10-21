package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[100000]);
	 int i = -1;
	 int j;
	 int k = 0;
	 int[] b = new int[100000];
	 a = new Scanner(System.in).nextLine();
	 while (true)
	 {
	   j = 0;
	   for (i++;((a.charAt(i) != ' ') && (a.charAt(i) != '\0'));i++)
	   {
		 j++;
	   }
	   b[k] = j;
	   k++;
	   if (a.charAt(i) == '\0')
	   {
	   break;
	   }
	  else if (a.charAt(i + 1) == ' ')
	  {
	   while (true)
	   {
	   i++;
	   if (a.charAt(i + 1) != ' ')
	   {
		 break;
	   }
	   }
	  }
	 }
	 for (i = 0;i < k - 1;i++)
	 {
	   System.out.printf("%d,",b[i]);
	 }
	 System.out.printf("%d",b[k - 1]);
	 return 0;
	}

}
