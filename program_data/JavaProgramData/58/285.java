package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
					  int n;
					  int i;
					  int m;
					  String a = new String(new char[1]);
					  a = new Scanner(System.in).nextLine();
					  n = Integer.parseInt(a);
					  for (i = 0;i < n;i++)
					  {
									  String str = new String(new char[80]);
									  str = new Scanner(System.in).nextLine();
									  m = str.length();
									  int p = 0;

									  if (((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')) || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) || (str.charAt(0) == '_'))
									  {
											  for (int k = 1;k < m;k++)
											  {
													  if (((str.charAt(k) >= 'a') && (str.charAt(k) <= 'z')) || ((str.charAt(k) >= 'A') && (str.charAt(k) <= 'Z')) || (str.charAt(k) == '_') || ((str.charAt(k) >= '0') && (str.charAt(k) <= '9')))
													  {
													  ;
													  }
													  else
													  {
													  p = 1;
													  }
											  }
									  }

									  else
									  {
									  p = 1;
									  }
									  if (p == 0)
									  {
									  System.out.print("1\n");
									  }
									  else
									  {
									  System.out.print("0\n");
									  }
					  }
	}


}
