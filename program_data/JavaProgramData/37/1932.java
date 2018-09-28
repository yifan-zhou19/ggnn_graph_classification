package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int t;
		  int x;
		  int u;
		  int count;
		  int[] a = new int[100001];
		  String string = new String(new char[100001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= t;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
						   memset(String,0,sizeof(String));
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   String = tempVar2;
						   }
						   count = String.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						   memset(a,0,(Integer.SIZE / Byte.SIZE));
						   for (j = 0;j <= count - 1;j++)
						   {
						   for (k = 0;k <= count - 1;k++)
						   {
						   if (String[j] == string.charAt(k))
						   {
						   a[j]++;
						   }
						   }
						   }
						   x = 0;
						   for (u = 0;u <= count - 1;u++)
						   {
						   if (a[u] == 1)
						   {
									  System.out.printf("%c\n",string.charAt(u));
									  x++;
									  break;
						   }
						   }
						   if (x == 0)
						   {
						   System.out.print("no\n");
						   }
		  }

	}








}

