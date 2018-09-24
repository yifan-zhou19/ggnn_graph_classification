package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int t;
		  int x;
		  int k;
		  int m;
		  int h;
		  int[] a = new int[26];
		  int[] b = new int[100000];
		  String str = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
					  for (j = 0;j < 26;j++)
					  {
					  a[j] = 0;
					  }
					  h = 0;
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  str = tempVar2.charAt(0);
					  }
					  m = str.length();
					  for (k = 0;k < m;k++)
					  {
									  b[k] = str.charAt(k) - 'a';
									  a[b[k]] = a[b[k]] + 1;
					  }
					  for (j = 0;j < m;j++)
					  {
									   if (a[b[j]] == 1 && h == 0)
									   {
												  System.out.printf("%c\n",b[j] + 'a');
												  h = 1;
									   }
					  }
					  if (h == 0)
					  {
					  System.out.print("no");
					  }
		  }

	}

}

