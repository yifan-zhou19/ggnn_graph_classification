package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[301]);
	 char c;
	 int i;
	 int j;
	 int len;
	 int[] a = new int[300];
	 int t = 0;
	 s = new Scanner(System.in).nextLine();
	 len = s.length();
	 for (i = 0;i < len - 1;i++)
	 {
	  for (j = 0;j < len - 1 - i;j++)
	  {
	   if (s.charAt(j) > s.charAt(j + 1))
	   {
		c = s.charAt(j);
		s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
		s = tangible.StringFunctions.changeCharacter(s, j + 1, c);
	   }
	  }
	 }
	 for (i = 0;i < len;i++)
	 {
	  if (s.charAt(i) <= 64 || s.charAt(i) >= 123 || (s.charAt(i) >= 91 && s.charAt(i) <= 96))
	  {
		  a[i] = -500;
	  }
	  else
	  {
		  a[i] = 1;
	  }
	 }
	 for (i = 0;i < len - 1;i++)
	 {
	  for (j = i + 1;j < len;j++)
	  {
	   if (s.charAt(i) == s.charAt(j))
	   {
		   a[i]++;
	   }
	  }
	 }
	 for (i = 0;i < len;i++)
	 {
	  if (a[i] > 0 && s.charAt(i) != s.charAt(i - 1))
	  {
		   System.out.printf("%c=%d\n",s.charAt(i),a[i]);
		   t++;
	  }
	 }
	 if (t == 0)
	 {
		 System.out.print("No");
	 }
	  return 0;
	}

}

