package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
	  int n;
	  int i;
	  int j;
	  int k;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  *(a.Substring(n)) = ' ';
	  *(a - 1) = ' ';
	  for (i = n - 1,j = n + 1;i >= -1;i--)
	  {
	  if (*(a.Substring(i)) == ' ')
	  {
		  for (k = i + 1; * (a.Substring(k)) != ' ';k++,j++)
		  {
		*(a.Substring(j)) = *(a.Substring(k));
		  }
		*(a.Substring(j)) = *(a.Substring(k)),j++;
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  System.out.printf("%c",*(a.Substring(n) + 1 + i));
	  }
	}


}
