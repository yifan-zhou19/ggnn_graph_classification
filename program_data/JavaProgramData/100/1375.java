package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int m = 0;
	  int t = 0;
	  char k;
	  String s = new String(new char[300]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  n = s.length();
		for (k = 'a';k <= 'z';k++)
		{
			  for (i = 0;i < n;i++)
			  {
				  if (s.charAt(i) == k)
				  {
					m++;
				  }
			  }
			if (m != 0)
			{
			   System.out.printf("%c=%d\n",k,m);
				  t++;
			}
		   m = 0;

		}
				if (t == 0)
				{
				System.out.print("No");
				}
		return 0;
	}

}

