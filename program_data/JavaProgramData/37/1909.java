package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  while (i <= t)
		  {
					  String str = new String(new char[100000]);
					  int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					  memset(str,0,(Character.SIZE / Byte.SIZE));
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  str = tempVar2.charAt(0);
					  }
					  int j = 0;
					  int k = 0;
					  a = str.length();
					  while (j < a)
					  {
								 while (k < a)
								 {
											if (str.charAt(j) != str.charAt(k) && j != k)
											{
											   k = k + 1;
											}
											else if (j == k)
											{
											   k = k + 1;
											}
											else
											{
											   break;
											}
								 }
								 if (k == a)
								 {
									break;
								 }
								 else
								 {
									  j = j + 1;
									  k = 0;
								 }
					  }
					  if (j == a)
					  {
						 System.out.print("no\n");
					  }
					  else
					  {
						   if (k == a)
						   {
							  System.out.printf("%c\n",str.charAt(j));
						   }
					  }
					  i = i + 1;
		  }

	}
}

