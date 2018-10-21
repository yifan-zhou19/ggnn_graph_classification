package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	final String a = "\0";
	char c;
	int n;
	int i;
	int j;
	int k = 0;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (c = 'a';c <= 'z';c++)
	{
		 j = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (a.charAt(i) == c)
		 {
			 j++;
		 }
	 }
	 if (j > 0)
	 {
		  System.out.printf("%c=%d\n",c,j);
		  k++;
	 }
	}
	if (k == 0)
	{
		System.out.print("No\n");
	}
	}
}
