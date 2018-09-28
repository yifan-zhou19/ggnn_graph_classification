package <missing>;

public class GlobalMembers
{
	public static int s1 = 0;
	public static int s2 = 0;
	public static void reads()
	{
		 s1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 s2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	public static void read(int s, int[] a)
	{
		 for (int i = 1;i <= s;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	public static void sort(int s, int[] a)
	{
	  for (int i = 1;i <= s - 1;i++)
	  {
	   for (int j = i + 1;j <= s;j++)
	   {
		 if (a[i] > a[j])
		 {
			 int c = a[i];
			 a[i] = a[j];
			 a[j] = c;
		 }
	   }
	  }
	}
	public static void combine(int s1, int s2, int[] a1, int[] a2)
	{
	  for (int i = s1 + 1;i <= s1 + s2;i++)
	  {
	  a1[i] = a2[i - s1];
	  }
	}
	public static void print(int s, int[] a)
	{
		  for (int i = 1;i <= s;i++)
		  {
		  System.out.print(a[i]);
	   if (i < s)
	   {
		   System.out.print(' ');
	   }
		  }
	}
	public static int Main()
	{
		int[] a1 = new int[500];
		int[] a2 = new int[500];
	reads();
	read(s1, a1);
	read(s2, a2);
	sort(s1, a1);
	sort(s2, a2);
	combine(s1, s2, a1, a2);
	print(s1 + s2, a1);
	return 0;
	}

}

