package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int n;
		int i;
		int j;
		int k;
		int q;
		int h;
		int f;
		int len1;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while ((s1 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (s2 = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			 memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2,0,(Integer.SIZE / Byte.SIZE));
			 i = 0;
		j = 0;
		k = 0;
		q = 0;

		len1 = s1.length();
		len2 = s2.length();
		for (i = len1 - 1;i >= 0;i--)
		{
		num1[j++] = s1.charAt(i) - '0'; //??????????
		}

		for (k = len2 - 1;k >= 0;k--)
		{
		num2[q++] = s2.charAt(k) - '0';
		}
		for (h = 0;h < len1;h++)
		{

			 num1[h] = num1[h] - num2[h];

				if (num1[h] < 0) //????????=???
				{
			   num1[h] = num1[h] + 10;
			   num1[h + 1] = num1[h + 1] - 1;
				}
		}
		 f = len1;
		  while (num1[f] == 0)
		  {
			  f--;
		  }
		   for (;f >= 0;f--)
		   {

			   System.out.print(num1[f]);
		   }

			System.out.print("\n");
	   }
	return 0;
	}





}

