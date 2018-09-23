package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 String ch1 = new String(new char[11]);
	 String ch2 = new String(new char[4]);
	 while (scanf("%s%s",ch1,ch2) != EOF)
	 {
		 int k;
		 int m = 0;
	  char t = ch1.charAt(0);
	  k = ch1.length();
	  for (i = 0;i <= k - 1;i++)
	  {
	   if (ch1.charAt(i) > t)
	   {
		t = ch1.charAt(i);
		m = i;
	   }
	  }
	  for (i = 0;i <= m;i++)
	  {
	   System.out.printf("%c",ch1.charAt(i));
	  }
	  for (i = 0;i <= 2;i++)
	  {
	   System.out.printf("%c",ch2.charAt(i));
	  }
	  if (m != k - 1)
	  {
	   for (i = m + 1;i <= k - 1;i++)
	   {
	   System.out.printf("%c",ch1.charAt(i));
	   }
	  }
	  System.out.print("\n");
	 }
	}



}
