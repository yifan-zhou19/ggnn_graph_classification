package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static int la;
	public static int lb;
	public static int appear(char c)
	{
		int i;
		for (i = 0;i < la;i++)
		{
			if (c == b.charAt(i))
			{
			b = b.substring(0, i);
			return (1);
			}
		}
		return (0);
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int k;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  la = a.length();
		  lb = b.length();
		  if (la != lb)
		  {
			  System.out.print("NO");
			  return (0);
		  }
		  for (i = 0;i < la;i++)
		  {
		  if (appear(a.charAt(i)) == 0)
		  {
		  System.out.print("NO");
		  return (0);
		  }
		  }
		  System.out.print("YES");
		  return (0);
	}

}

