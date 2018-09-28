package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[] a = new int[255];
		   int[] b = new int[255];
		   int[] c = new int[255];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		   memset(c,0,(Integer.SIZE / Byte.SIZE));
		   String str = new String(new char[255]);
		   int len1;
		   int len2;
		   str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   len1 = str.length();
		   for (int i = 0; i < len1; i++)
		   {
				   a[len1 - 1 - i] = str.charAt(i) - '0';
		   }
		   str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   len2 = str.length();
		   for (int i = 0; i < len2; i++)
		   {
				   b[len2 - 1 - i] = str.charAt(i) - '0';
		   }
		   if (len1 > len2)
		   {
			   len2 = len1;
		   }
		   for (int i = 0; i < len2; i++)
		   {
				   c[i] = a[i] + b[i];
		   }
		   for (int i = 0; i < len2; i++)
		   {
				   if (c[i] >= 10)
				   {
						   c[i + 1] += c[i] / 10;
						   c[i] %= 10;
				   }
		   }
		   for (int i = len2; i >= 0; i--)
		   {
				   if (c[i] != 0)
				   {
						   len2 = i;
						   break;
				   }
				   if (i == 0)
				   {
					   len2 = -1;
				   }
		   }
		   if (len2 < 0)
		   {
			   System.out.print("0");
			   System.out.print("\n");
			   return 0;
		   }
		   for (int i = len2; i >= 0; i--)
		   {
				   System.out.print(c[i]);
		   }
		   System.out.print("\n");
	}
}

