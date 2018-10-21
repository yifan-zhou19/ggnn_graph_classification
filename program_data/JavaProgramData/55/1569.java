package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int ah;
	   int af;
	   int i;
	   int j = 0;
	   int len = 0;
	   int sum = 0;
	   int jin = 1;
	   int[] zhuan = new int[100];
	   String num = new String(new char[100]);
	   String zhuanfu = new String(new char[100]);
	   ah = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   num = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   af = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   len = num.length();
	   if (num.charAt(0) == '0')
	   {
	   System.out.print("0");
	   }
	   for (i = len - 1;i >= 0;i--)
	   {
	   if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
	   {
	   num.charAt(i) -= 87;
	   }
	   if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
	   {
	   num.charAt(i) -= 55;
	   }
	   if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
	   {
	   num.charAt(i) -= 48;
	   }
	   sum += num.charAt(i) * jin;
	   jin *= ah;
	   }
	   while (sum != 0)
	   {
		  zhuan[j] = sum % af;
		  sum /= af;
		  j++;
	   }
	   for (i = j - 1;i >= 0;i--)
	   {
	   if (zhuan[i] >= 10)
	   {
	   System.out.printf("%c",zhuan[i] + 55);
	   }
	   else
	   {
	   System.out.printf("%d",zhuan[i]);
	   }
	   }
	}

}

