package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String N = new String(new char[100]);
		  String Result = new String(new char[100]);
		  int[] Z = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(N,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(Result,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(Z,0,(Integer.SIZE / Byte.SIZE));
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  N = tempVar.charAt(0);
		  }
		  int i = 0;
		  int j = 0;
		  int k = 0;
		  int b;
		  int c;
		  int d;
		  int e;
		  int g;
		  int a = N.length();
		  g = 1;
		  if (a == 1)
		  {
				   System.out.print("0\n");
				   System.out.printf("%d",N.charAt(0) - '0');
		  }
		  else
		  {
			   e = N.charAt(0) - '0';
			   c = N.charAt(1) - '0';
			   while (g == 1)
			   {
						   if ((e * 10 + c) < 13)
						   {
										   if (a == 2)
										   {
													System.out.print("0\n");
													System.out.printf("%d",e * 10 + c);
													break;
										   }
										   else
										   {
												e = e * 10 + c;
												i = 1;
										   }
						   }
						   while (i <= (a - 2))
						   {
										   b = e;
										   c = N.charAt(i + 1) - '0';
										   d = b * 10 + c;
										   Z[j] = d / 13;
										   e = d % 13;
										   i++;
										   j++;
						   }
						   if (i == (a - 1))
						   {
										b = e;
										c = N.charAt(i + 1) - '0';
										d = b * 10 + c;
										Z[j] = d / 13;
										j++;
						   }
						   while (k <= (j - 2))
						   {
										   Result = tangible.StringFunctions.changeCharacter(Result, k, Z[k] + '0');
										   k++;
						   }
						   System.out.printf("%s\n",Result);
						   System.out.printf("%d",e);
						   g = 0;
			   }
		  }

		  return 0;
	}

}

