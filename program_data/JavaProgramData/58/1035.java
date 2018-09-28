package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int judge;
		  int l;
		  int j;
		  String s = new String(new char[100]);
		  for (i = 0;i < n;i++)
		  {
			  s = new Scanner(System.in).nextLine();
			  judge = 1;
			  if (s.charAt(0) < 'A' || s.charAt(0)>'Z')
			  {
				if (s.charAt(0) < 'a' || s.charAt(0)>'z')
				{
				  if (s.charAt(0) != '_')
				  {
					judge = 0;
				  }
				}
			  }
			  l = s.length();
			  for (j = 0;j < l;j++)
			  {
				  if (s.charAt(j) < 'A' || s.charAt(j)>'Z')
				  {
					 if (s.charAt(j) < 'a' || s.charAt(j)>'z')
					 {
						if (s.charAt(j) < '0' || s.charAt(j)>'9')
						{
						   if (s.charAt(j) != '_')
						   {
							   judge = 0;
						   }
						}
					 }
				  }
			  }
			  System.out.printf("%d\n",judge);
		  }
	}

}

