package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  String a = new String(new char[100000]);
		  int[] b = new int[100000];
		  for (int i = 0;i < t;i++)
		  {
				  for (int x = 0;x < 100000;x++)
				  {
						  a = a.substring(0, x);
						  b[x] = 0;
				  }
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a = tempVar2.charAt(0);
				  }
				  int len = a.length();
				  int j;
				  for (j = 0;j < len;j++)
				  {
						  for (int k = j + 1;k < len;k++)
						  {
								  if (a.charAt(j) == a.charAt(k))
								  {
										   b[j]++;
										   b[k]++;
								  }
						  }
						  if (b[j] == 0)
						  {
											 System.out.printf("%c\n",a.charAt(j));
											 break;
						  }
				  }
				  if (j == len)
				  {
				  System.out.print("no\n");
				  }
		  }
	}


}

