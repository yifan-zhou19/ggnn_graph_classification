package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int[] d = new int[10];
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int l = 0;
	 String s = new String(new char[1000]);
	 String q = new String(new char[100]);
	 String w = new String(new char[100]);
	 s = new Scanner(System.in).nextLine();
	 q = new Scanner(System.in).nextLine();
	 w = new Scanner(System.in).nextLine(); //??
	 for (j = 0;j < 100;j++)
	 {
		 if (s.charAt(j) == '\0' && a == 0)
		 {
			 a = j; //"="
		 }
	  if (q.charAt(j) == '\0' && b == 0)
	  {
		  b = j;
	  }
	  if (w.charAt(j) == '\0' && c == 0)
	  {
		  c = j;
	  }
	  if (a != 0 && b != 0 && c != 0)
	  {
		  break;
	  }
	 }
	  for (i = 0;i <= a;i++)
	  {
	   if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
	   {
		for (j = 0;j < b;j++)
		{
		 if (q.charAt(j) != s.charAt(i - b + j))
		 {
			 break;
		 }
		 else if (s.charAt(i - b - 1) == ' ' || i == b)
		 {
			 d[k++] = i;
			 j = b;
		 }
		}
	   }
	  }
	  if (k != 0) //"||"???�break�???,"k++"??????
	  {
	   for (i = 0;i < a;i++)
	   {
		if (i == d[l] - b)
		{
			for (j = 0;j < c;j++)
			{
				System.out.printf("%c",w.charAt(j));
			}
			i = d[l] - 1;
			l++;
		}
		else
		{
			System.out.printf("%c",s.charAt(i));
		}
	   }
	  }
	  else
	  {
		  for (i = 0;i < a;i++)
		  {
			  System.out.printf("%c",s.charAt(i));
		  }
	  }
	 return 0;
	}
}
