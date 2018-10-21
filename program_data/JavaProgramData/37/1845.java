package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int N;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  N = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= N;i++)
		  {
			   String ch = new String(new char[100000]);
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   ch = tempVar2.charAt(0);
			   }
			   int j;
			   int k;
			   int ji = 0;
			   int m = ch.length();
			   for (k = 0;k <= m - 1;k++)
			   {
				   for (j = 0;j <= m - 1;j++)
				   {
						if (k == j)
						{
							continue;
						}
						if (ch.charAt(k) == ch.charAt(j))
						{
							break;
						}
				   }
				   if (j == m)
				   {
					   System.out.printf("%c\n",ch.charAt(k));
					   break;
				   } //chuxianle
			   }
			   if (k == m)
			   {
				   System.out.print("no\n");
			   }
		  }
	}
}

