package <missing>;

public class GlobalMembers
{
	public static int add(int maxlen, int[] num1, int[] num2)
	{
	   int i;
	   highestpos = 0;
	   for (i = 0;i <= maxlen;i++)
	   {
		  num1[i] = num1[i] + num2[i];
		  if (num1[i] >= 10)
		  {
			  num1[i] = num1[i] - 10;
			  num1[i + 1]++;
		  }
		  if (num1[i] != 0)
		  {
			  highestpos = i;
		  }
	   }
	   return highestpos;
	}
	public static String a = new String(new char[251]);
	public static String b = new String(new char[251]);
	public static int[] num1 = new int[251];
	public static int[] num2 = new int[251];
	public static int maxlen;
	public static int len1;
	public static int len2;
	public static int highestpos;
	public static int Main()
	{
	   int i;
	   int j;
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   len1 = a.length();
	   len2 = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(num2,0,(Integer.SIZE / Byte.SIZE));
	   maxlen = (len1 > len2)? len1:len2;
	   for (i = len1 - 1,j = 0;i >= 0;i--,j++)
	   {
		   num1[i] = a.charAt(j) - '0';
	   }
	   for (i = len2 - 1,j = 0;i >= 0;i--,j++)
	   {
		   num2[i] = b.charAt(j) - '0';
	   }
	   highestpos = add(maxlen, num1, num2);
	   for (i = highestpos;i >= 0;i--)
	   {
		   System.out.print(num1[i]);
	   }
	   return 0;
	}
}

