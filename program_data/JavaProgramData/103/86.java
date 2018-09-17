package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[1000]);
	 s = new Scanner(System.in).nextLine();
	 int i;
	 int count = 1;
	 int[] a = new int[1000];
	 for (i = 0;i < 100;i++)
	 {
	 a[i] = 1;
	 }
	 for (i = 1;s.charAt(i - 1) != '\0';i++)
	 {
	  if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i) - s.charAt(i - 1) == 32 || s.charAt(i) - s.charAt(i - 1) == -32)
	  {
	  a[count]++;
	  }
	  else
	  {
	   if (s.charAt(i - 1) > 'Z' || s.charAt(i - 1) < 'A')
	   {
		 System.out.printf("(%c,%d)",s.charAt(i - 1) - 32,a[count]);
		 count++;
	   }
	   else
	   {
		System.out.printf("(%c,%d)",s.charAt(i - 1),a[count]);
		count++;
	   }
	  }
	 }
	 System.in.read();
	}

}
