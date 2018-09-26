package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 a = new Scanner(System.in).nextLine();
	 int i;
	 int n;
	 int j;
	 int k;
	 for (i = 0;a[i];i++)
	 {
	 if (a[i] == ' ')
	 {
		 a[i] = '#';
	 }
	 }
	 n = a.length();
	 for (i = 0;i < n;i++)
	 {
	  if (!(a[i] - '0' >= 0 && a[i] - '0' <= 9))
	  {
		  a[i] = '#';
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (a[i] == '#')
	  {
		  continue;
	  }
	  if (a[i] - '0' >= 0 && a[i] - '0' <= 9)
	  {
		  System.out.printf("%d",a[i] - '0');
	  }
	  if (a[i] - '0' >= 0 && a[i] - '0' <= 9 && a[i + 1] == '#')
	  {
		  System.out.print("\n");
	  }
	 }
	}
}
