package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String num1 = new String(new char[32]);
		int[] num2 = new int[32];
		int num;
		int i;
		int lenth;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (lenth = 0;num1.charAt(lenth) != '\0';lenth++)
		{
			 if (num1.charAt(lenth) <= '9')
			 {
				 num1.charAt(lenth) -= '0';
			 }
			 else
			 {
				 num1.charAt(lenth) -= 'A' - 10;
			 }
			 if (num1.charAt(lenth) >= 35)
			 {
				 num1.charAt(lenth) -= 32;
			 }
		}
		for (i = 1,num = num1.charAt(0);i < lenth;i++)
		{
		   num = num * a + num1.charAt(i);
		}
		for (i = 31;num >= b;i--)
		{
			  num2[i] = num % b + 1;
			  num /= b;
		}
		num2[i] = num + 1;
		for (i = 0;i < 32;i++)
		{
			 if (num2[i] == 0)
			 {
				 continue;
			 }
			 else if (num2[i] < 10)
			 {
				 System.out.printf("%d",num2[i] - 1);
			 }
			 else
			 {
				 System.out.printf("%c",num2[i] + 'A' - 11);
			 }
		}
		return 1;
	}

}

