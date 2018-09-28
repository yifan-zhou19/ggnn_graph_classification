package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if ((Integer.parseInt(str1) == 0) && (Integer.parseInt(str2) == 0))
		{
			System.out.print(0);
			return 0;
		}
		int l1;
		int l2;
		l1 = str1.length();
		l2 = str2.length();
		int[] num1 = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1,0,(Integer.SIZE / Byte.SIZE));
		int[] num2 = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2,0,(Integer.SIZE / Byte.SIZE));
		int i;
		for (i = 0;i < l1;i++)
		{
			num1[i] = str1.charAt(l1 - 1 - i) - '0';
		}
		for (i = 0;i < l2;i++)
		{
			num2[i] = str2.charAt(l2 - 1 - i) - '0';
		}
		int[] num = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		int l;
		if (l1 >= l2)
		{
			l = l1;
			 for (i = 0;i < l1;i++)
			 {

				   num[i] = num1[i] + num2[i];
			 }
		}
		else
		{
			l = l2;
			for (i = 0;i < l2;i++)
			{

				   num[i] = num1[i] + num2[i];
			}
		}
		for (i = 0;i <= l;i++)
		{

			if (num[i] >= 10)
			{
			 num[i + 1] = num[i + 1] + num[i] / 10;
			 num[i] = num[i] % 10;
			}
		}
		int p = 0;
		for (i = 0;i <= l;i++)
		{
		  if (num[l - i] > 0)
		  {
		  p = 1;
		  }
		  if (p > 0)
		  {
		  System.out.print(num[l - i]);
		  }
		}
		return 0;
	}
}

