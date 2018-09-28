package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int[] num1 = new int[100];
		 int[] num2 = new int[100];
		 int l1 = 0;
		 int l2 = 0;
		 int i;
		 int j = 0;
		 int n = 0;
		 String ch1 = new String(new char[100]);
		 String ch2 = new String(new char[100]);
		 char c;
		 for (i = 0;i < 100;i++)
		 {
			 num1[i] = 0;
			 num2[i] = 0;
			 ch1 = tangible.StringFunctions.changeCharacter(ch1, i, '0');
			 ch2 = tangible.StringFunctions.changeCharacter(ch2, i, '0');
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 for (i = 0;(c = System.in.read()) != ' ';i++)
		 {
			 l1++;
			 ch1 = tangible.StringFunctions.changeCharacter(ch1, i, c);
			 if ('0' <= c && c <= '9')
			 {
				 num1[i] = c - '0';
			 }
			 else if ('a' <= c && c <= 'z')
			 {
				 num1[i] = c - 'a' + 10;
			 }
			 else if ('A' <= c && c <= 'Z')
			 {
				 num1[i] = c - 'A' + 10;
			 }
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < l1;i++)
		 {
			 n = n + num1[i] * (int)Math.pow(a,l1 - 1 - i);
		 }
		 for (i = 1;j == 0;i++)
		 {
			 if (n / (int)Math.pow(b,i) == 0)
			 {
				j = 1;
				break;
			 }
		 }
		 l2 = i;
		 for (i = 0;i < l2;i++)
		 {
			 num2[99 - i] = n % b;
			 n = (n - num2[99 - i]) / b;
			 if (0 <= num2[99 - i] != 0 && num2[99 - i] <= 9)
			 {
				 ch2 = tangible.StringFunctions.changeCharacter(ch2, 99 - i, num2[99 - i] + '0');
			 }
			 else if (10 <= num2[99 - i])
			 {
				 ch2 = tangible.StringFunctions.changeCharacter(ch2, 99 - i, num2[99 - i] - 10 + 'A');
			 }
		 }
		 for (i = 0;i < l2;i++)
		 {
			 System.out.printf("%c",ch2.charAt(100 - l2 + i));
		 }
	}


}

