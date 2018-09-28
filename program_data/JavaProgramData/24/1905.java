package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[1000]);
	 int len;
	 a = new Scanner(System.in).nextLine();
	  len = a.length();
	 int i;
	 int j;
	 int m = 0;
	 int x = 0;
	 int[] num = new int[200];
	 int[] b = new int[200];
	 for (i = 0;i <= len;i++)
	 {
	  m++;
	  if (a.charAt(i) == ' ' || a.charAt(i) == '\0' || a.charAt(i) == ',')
	  {
	   num[x] = m - 1;
	   b[x] = i;
	   x++;
	   m = 0;
	  }
	 }

	 int e;
	 int n = 0;
	 int y = 0;
	 for (i = 0;i < x;i++)
	 {
	  if (num[i] > num[n])
	  {
	   n = i;
	  }
	  if (num[i] < num[y] && num[i] != 0)
	  {
	   y = i;
	  }
	 }

	 for (i = b[n] - num[n];i < b[n];i++)
	 {
	  if (i != b[n] - 1)
	  {
	   System.out.printf("%c",a.charAt(i));
	  }
	  if (i == b[n] - 1)
	  {
	   System.out.printf("%c\n",a.charAt(i));
	  }
	 }


	 for (i = b[y] - num[y];i < b[y];i++)
	 {
	   if (i != b[y] - 1)
	   {
		System.out.printf("%c",a.charAt(i));
	   }
	   if (i == b[y] - 1)
	   {
		System.out.printf("%c\n",a.charAt(i));
	   }
	 }
	 return 0;
	}



}
