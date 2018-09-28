package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[501]);
		  char[][] b = new char[500][5];
		  int n;
		  int i;
		  int j;
		  int k;
		  int t;
		  int p;
		  int q = 0;
		  int s;
		  int[] c = new int[500];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  k = a.length();
		  s = 0;
		  for (i = 0;i <= k - n;i++)
		  {
		  t = 0;
						   for (j = i;j <= n + i - 1;j++)
						   {
												b[i][t] = a.charAt(j);
												t++;
						   }
		  }
		  c[0] = 1;
		  for (i = 1;i <= k - n;i++)
		  {
							 for (j = 0;j <= i;j++)
							 {
												if (strcmp(b[i],b[j]) == 0)
												{
												c[j]++;
												break;
												}
							 }
		  }
		  for (i = 0;i <= k - n;i++)
		  {
							 if (c[i] > s)
							 {
							 s = c[i];
							 }
		  }
							if (s == 1)
							{
						   System.out.print("NO\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						   goto loop;
							}
		  System.out.printf("%d\n",s);
		  for (i = 0;i <= k - n;i++)
		  {
							 if (c[i] == s)
							 {
							 System.out.printf("%s\n",b[i]);
							 }
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  loop:
		  ;

	}

}

