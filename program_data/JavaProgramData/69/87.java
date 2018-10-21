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
	public static int maxlen;
	public static int len1;
	public static int len2;
	public static int highestpos;
	public static int[] num1 = new int[256];
	public static int[] num2 = new int[256];
	public static String a = new String(new char[256]);
	public static String b = new String(new char[256]);
	public static int Main()
	{
	   int i;
	   int j;
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   len1 = a.length();
	   len2 = b.length();
	   maxlen = (len1 > len2)? len1:len2;
	   for (i = 0,j = len1 - 1;i < len1;i++,j--)
	   {
		   num1[i] = a.charAt(j) - '0';
	   }
	   for (i = 0,j = len2 - 1;i < len2;i++,j--)
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

