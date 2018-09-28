package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[101]);
	 int i;
	 int j;
	 int k;
	 int c;
	 int d = 0;
	 int e = 0;
	 int f = 1;
	 a = new Scanner(System.in).nextLine();
	 c = a.length();
	 for (i = 0;a.charAt(i) != ' ';i++)
	 {
		 d = d + 1;
	 }

	 for (e == 0,j = d + 2;j < c;j++)
	 {
		  if (a[0] = a.charAt(j) != null)
		  {
			for (k = j,i = 0;i <= d - 1;k++,i++)
			{
			 if (a.charAt(k) == a.charAt(i))
			 {
				 e = 1;
			 }
			 else
			 {
				 e = 0;
			 }
			}
	 if (e == 1 && f == 1)
	 {
		 System.out.printf("%d\n",j - d - 1);
		 f++;
	 }
		  }
	 }
	}
}
