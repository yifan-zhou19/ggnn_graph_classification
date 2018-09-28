package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] result = new int[100];
		int length;
		int[] num = new int[101];
		int i;
		int k;
		int small;
		int large;
		int not_zero;
		for (i = 0;i < 100;i++)
		{
			 result[i] = -1;
		}
		String c = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		length = c.length();
		for (i = 0;i < length;i++)
		{
			 num[i] = (int)c.charAt(i) - '0';
		}
		for (i = 0;i < length;i++)
		{
			result[i] = num[i] / 13;
			num[i + 1] = num[i + 1] + (num[i] % 13) * 10;
		}
	   for (i = 0;i < 100;i++)
	   {
		   if (result[i] != 0)
		   {
			   small = i;
			   break;
		   }
	   }
	   for (i = 99;i >= 0;i--)
	   {
		   if (result[i] != -1)
		   {
			   large = i;
			   break;
		   }
	   }
	   for (i = small;i <= large;i++)
	   {
		  System.out.printf("%d",result[i]);
		  not_zero = 1;
	   }
	   if (not_zero == 1)
	   {
		   System.out.print("\n");
		   System.out.printf("%d\n",num[length] / 10);
	   }
	   else
	   {
		   System.out.print("0\n");
		   System.out.printf("%s",c);
	   }
	}
}

