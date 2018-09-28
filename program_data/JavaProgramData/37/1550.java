package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] sn = new int[128];
		  for (int i = 'a';i <= 'z';i++)
		  {
			  sn[i] = i;
		  }
		  final String ns = "abcdefghijklmnopqrstuvwxyz";
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int t = 0;t < n;t++)
		  {
				  String s = new String(new char[100000]);
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  s = tempVar2.charAt(0);
				  }
				  int len = s.length();
				  int i = 0;
				  int[] a = new int[26];
				  int[] sort = new int[26];
				  int cixu = 0;
				  for (int j = 0;j < len;j++)
				  {
						for (i = 'a';i <= 'z';i++)
						{
								if (sn[s.charAt(j)] == i)
								{
									  a[i - 'a']++;
									  if (a[i - 'a'] == 1)
									  {
											  cixu++;
											  sort[i - 'a'] = cixu;
									  }
									  break;
								}
						}
				  }
				  int first = 27;
				  int temp = 0;
				  for (i = 'a';i <= 'z';i++)
				  {
						 if (a[i - 'a'] == 1)
						 {
								if (sort[i - 'a'] < first)
								{
									 first = sort[i - 'a'];
									 temp = i - 'a';
								}
						 }
				  }
				  if (t != n - 1)
				  {
				  if (first == 27)
				  {
					  System.out.print("no\n");
				  }
				  else
				  {
					  System.out.printf("%c\n",ns.charAt(temp));
				  }
				  }
				  else
				  {
				  if (first == 27)
				  {
					  System.out.print("no");
				  }
				  else
				  {
					  System.out.printf("%c",ns.charAt(temp));
				  }
				  }
		  }
	}

}

