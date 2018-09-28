package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int j;
		  int k;
		  int m;
		  String s = new String(new char[100005]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (k = 1;k <= t;k++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  for (i = 0;s.charAt(i) != '\0';i++)
			  {
				  m = i;
			  }
			  for (i = 0;i <= m;i++)
			  {
				  for (j = 0;j <= m;j++)
				  {
					   if (j == i)
					   {
						   continue;
					   }
					   if (s.charAt(j) == s.charAt(i))
					   {
						   break;
					   }
				  }
				  if (j == m + 1)
				  {
					System.out.printf("%c\n",s.charAt(i));
					break;
				  }
			  }
			  if (i == m + 1)
			  {
			  System.out.print("no\n");
			  }
		  }
	}
}

