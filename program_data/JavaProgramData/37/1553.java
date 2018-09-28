package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m;
		  int n;
		  int t;
		  int[] a = new int[26];
		  String s = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
						   for (t = 0;t < 26;t++)
						   {
						   a[t] = 0;
						   }
						   k = 0;
						   s = new Scanner(System.in).nextLine();
						   m = s.length();
						   for (j = 0;j < m;j++)
						   {
						   a[s.charAt(j) - 'a']++;
						   }
						   for (j = 0;j < m;j++)
						   {
										   if (a[s.charAt(j) - 'a'] == 1)
										   {
								System.out.printf("%c\n",s.charAt(j));
								k = 1;
								break;
										   }
						   }
						   if (k == 0)
						   {
						   System.out.print("no\n");
						   }
		  }
	}

}

