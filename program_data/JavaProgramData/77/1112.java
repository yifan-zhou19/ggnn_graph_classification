package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[1000]);
	 a = new Scanner(System.in).nextLine();
	 int n;
	 n = a.length();
	 int[] b = new int[n];
	 int i = 0;
	 int j = 0;
	 int c = 0;
	 int k = 0;
	 while (i < n)
	 {
	  b[i] = 1;
	  i++;
	 }
	 i = 0;
	 while (k < n / 2)
	 {
	  c = 0;
	  if (b[i] == 0)
	  {
	   i++;
	  }
	  else
	  {
	   j = i + 1;
	   while (c == 0)
	   {
		if (b[j] == 0)
		{
		 j++;
		}
		else
		{
		 if (a.charAt(j) == a.charAt(i))
		 {
		  i++,c = 1;
		 }
		 else
		 {
		  System.out.printf("%d %d\n",i,j);
		  k++;
		  b[i] = 0;
		  i = 0;
		  b[j] = 0;
		  c = 1;
		 }
		}
	   }
	  }
	 }
	}

}
