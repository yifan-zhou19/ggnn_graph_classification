package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  int[] c = new int[100];
		  int[] d = new int[100];
		  int i;
		  int j;
		  int k;
		  int l;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (l = 0;l < n;l++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = tempVar2.charAt(0);
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  b = tempVar3.charAt(0);
						  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						  memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						  memset(d,0,(Integer.SIZE / Byte.SIZE));
						  int n1 = a.length();
						  j = 0;
						  for (i = n1 - 1;i >= 0;i--)
						  {
							  c[j++] = a.charAt(i) - '0';
						  }
						  int n2 = b.length();
						  j = 0;
						  for (i = n2 - 1;i >= 0;i--)
						  {
							  d[j++] = b.charAt(i) - '0';
						  }
						  for (i = 0;i < 100;i++)
						  {
											c[i] = c[i] - d[i];
											if (c[i] < 0)
											{
													  c[i] = c[i] + 10;
													  c[i + 1]--;
											}
						  }
						  k = 99;
						  while (c[k] == 0 && k > 0)
						  {
							  k--;
						  }
						  for (i = k;i >= 0;i--)
						  {
							  System.out.printf("%d",c[i]);
						  }
						  System.out.print("\n");
		  }
		  return 0;
	}

}

