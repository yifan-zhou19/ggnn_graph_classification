package <missing>;

public class GlobalMembers
{
	public static int judge(String c, int n)
	{
		int i;
		i = 0;
		if (c[0].compareTo('a') >= 0 && c[0].compareTo('z') <= 0 || c[0].compareTo('A') >= 0 && c[0].compareTo('Z') <= 0 || c[0].equals('_'))
		{
			while ((c[i].compareTo('a') >= 0 && c[i].compareTo('z') <= 0 || c[i].compareTo('A') >= 0 && c[i].compareTo('Z') <= 0 || c[i].equals('_') || c[i].compareTo('0') >= 0 && c[i].compareTo('9') <= 0) && i < n)
			{
			i++;
			}
			if (i == n)
			{
			return 1;
			}
			else
			{
			return 0;
			}
		}
		else
		{
		return 0;
		}
	}

	public static int Main()
	{
		  String c = new String(new char[21]);
		  int n;
		  int m;
		  int i;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			   c = new Scanner(System.in).nextLine();
			   m = c.length();
			   if (judge(c, m) != 0)
			   {
			   System.out.print("yes\n");
			   }
			   else
			   {
			   System.out.print("no\n");
			   }
		  }

	}

}

