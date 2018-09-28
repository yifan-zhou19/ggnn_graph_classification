package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  int[] b = new int[1000];
		  int l;
		  int n;
		  int i;
		  int j;
		  s = new Scanner(System.in).nextLine();
		  l = s.length();
		  n = 0;
		  for (i = 0;i <= l - 1;i++)
		  {
			  n = n * 10 + s.charAt(i) - 48;
			  b[i] = n / 13;
			  n = n % 13;
		  }
		  j = 0;
		  while ((b[j] == 0) && (j <= l - 1))
		  {
			  j++;
		  }
		  if (j == l)
		  {
			  j--;
		  }
		  for (i = j;i <= l - 1;i++)
		  {
		  System.out.printf("%d",b[i]);
		  }
		  System.out.print("\n");
		  System.out.printf("%d",n);
	}

}
