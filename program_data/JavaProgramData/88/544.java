package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String str = new String(new char[35]);
		  String p;
		  int t;
		  int i;
		  int l = 0;
		  str = new Scanner(System.in).nextLine();
		  p = str;
		  for (i = 0; * (p.Substring(i)) != '\0';i++)
		  {
				if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
				{
					  System.out.print((p.Substring(i)));
					  t = 1;
				}
				else
				{
					  t = 0;
				}
				if (t == 0 && *(p.Substring(i) - 1) >= '0' && *(p.Substring(i) - 1) <= '9')
				{
					System.out.print("\n");
				}
				l++;
		  }
		  if (*(p.Substring(l) - 1) >= '0' && *(p.Substring(l) - 1) <= '9')
		  {
				System.out.print("\n");
		  }
		  return 0;
	}
}
