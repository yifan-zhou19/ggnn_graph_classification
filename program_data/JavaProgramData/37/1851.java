package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (j = 0;j < m;j++)
		  {
		  int n = 0;
		  String s = new String(new char[1000]);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  int l;
		  int i;
		  l = s.length();
		  int[] b = new int[1000];
		  for (i = 0;i < l;i++)
		  {
						  b[s.charAt(i)]++;
		  }
		  for (i = 0;i < l;i++)
		  {
						  if (b[s.charAt(i)] == 1)
						  {
										System.out.printf("%c\n",s.charAt(i));
										 n = 1;
										break;

						  }
		  }
		  if (n == 0)
		  {
		  System.out.print("no\n");
		  }
		  }
	}

}

