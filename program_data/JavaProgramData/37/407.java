package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static String s = new String(new char[100100]);
	public static void Main()
	{
		 int g;
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 g = Integer.parseInt(tempVar);
		 }
		 while (g-- != 0)
		 {
				   String p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
				   int q;
				   s = new Scanner(System.in).nextLine();
				   if (s.charAt(0) == '\0')
				   {
								 g++;
								 continue;
				   }
				   p = s;
				   for (q = a;q < a + 30;q++)
				   {
									  q = null;
				   }
				   n = s.length();
				   for (p = s;p < s.Substring(n);p++)
				   {
									 a[p - 'a']++;
				   }
				   int flag = 0;
				   q = a;
				   for (p = s;p < s.Substring(n);p++)
				   {
									 if (*(q + (p - 'a')) == 1)
									 {
				 //  for (q=a;q<a+30;q++)
			   //    {
			   //        if(*q==1)
			   //        {
								System.out.printf("%c\n", p);
								flag = 1;
								break;
									 }
				   }
				   if (flag == 0)
				   {
							System.out.print("no\n");
				   }
		 }
	}

}

