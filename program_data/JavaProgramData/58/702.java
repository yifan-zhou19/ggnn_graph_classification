package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int n;
	  int t;
	  int m;
	  int j;
	  String a = new String(new char[85]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.in.read();
	  for (i = 1;i <= n;i++)
	  {
		a = new Scanner(System.in).nextLine();
		m = a.length();
		if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		if (t != 0)
		{
		  for (j = 1;j < m;j++)
		  {
			if ((a.charAt(j) == '_') || ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')) || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
			{
				t = 1;
			}
			else
			{
			  t = 0;
			  break;
			}
		  }
		}
		if (t != 0)
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

