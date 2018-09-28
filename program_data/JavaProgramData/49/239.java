package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int i;
	int j;
	int k;
	int n;
	int sum = 0;
	s = new Scanner(System.in).nextLine();
	n = s.length();
	for (j = 1;j <= n;(j = j + 2))
	{
	  for (i = 0;(i + j) < n;i++)
	  {
		 for (k = 0;k <= (j / 2);k++)
		 {
			if (s.charAt(i + j / 2 - k) == s.charAt(i + j / 2 + 1 + k))
			{
			sum++;
			}
		 }
		 if (sum == j / 2 + 1)
		 {
				for (k = i;k <= i + j;k++)
				{
				System.out.printf("%c",s.charAt(k));
				}
				System.out.print("\n");
		 }
		 sum = 0;
	  }
	}
	System.in.read();
	System.in.read();
	}

}
