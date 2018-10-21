package <missing>;

public class GlobalMembers
{
	public static int convertor(String A, int code, int right)
	{
		if (right == 0)
		{
			return (A[0]);
		}
		else
		{
			return (A[right].Substring(code) * convertor(A, code, right - 1));
		}
	}

	public static void Main()
	{
		int shuzhi1;
		int shuzhi2;
		int i;
		int j;
		int n;
		int l;
	 String num1 = new String(new char[20]);
	 String num2 = new String(new char[20]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 shuzhi1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 num1 = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 shuzhi2 = Integer.parseInt(tempVar3);
	 }
	 n = num1.length();
	 for (i = 0;i < n;i++)
	 {
			if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'Z')
			{
			 num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(i) - 'A' + 10);
			}
		 else if (num1.charAt(i) >= 'a' && num1.charAt(i) <= 'z')
		 {
			 num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(i) - 'a' + 10);
		 }
		 else if (num1.charAt(i) >= '0' && num1.charAt(i) <= '9')
		 {
			 num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(i) - '0');
		 }
	 }
	 l = convertor(num1, shuzhi1, n - 1);
	 j = 0;
	while (l / shuzhi2 > 0)
	{
		 num2 = tangible.StringFunctions.changeCharacter(num2, j, l % shuzhi2);
		 l = l / shuzhi2;
		 j++;
	}
	 num2 = tangible.StringFunctions.changeCharacter(num2, j, l);
	 for (i = 0;i <= j;i++)
	 {
				 if (num2.charAt(i) > 9)
				 {
			 num2 = tangible.StringFunctions.changeCharacter(num2, i, num2.charAt(i) - 10 + 'A');
				 }
			 else
			 {
				 num2 = tangible.StringFunctions.changeCharacter(num2, i, num2.charAt(i) + '0');
			 }
	 }
	 for (i = j;i >= 0;i--)
	 {
		 System.out.printf("%c",num2.charAt(i));
	 }
	}

}

