package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		String num = new String(new char[101]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (i = 0;num.charAt(i) != '\0';i++)
		{
		n++;
		}
		if (n == 1)
		{
		System.out.printf("0\n%c",num.charAt(0));
		}
		else if ((n == 2) && ((num.charAt(1) - '0') < 3) && (num.charAt(0) == '1'))
		{
		System.out.printf("0\n%c%c",num.charAt(0),num.charAt(1));
		}
		else
		{
		for (j = 1;j <= n - 1;j++)
		{
		  b = tangible.StringFunctions.changeCharacter(b, j - 1, ((num.charAt(j - 1) - '0') * 10 + (num.charAt(j) - '0')) / 13 + '0');
		  num = tangible.StringFunctions.changeCharacter(num, j, ((num.charAt(j - 1) - '0') * 10 + (num.charAt(j) - '0')) % 13 + '0');
		  k = num.charAt(j) - '0';
		}
		b = tangible.StringFunctions.changeCharacter(b, n - 1, '\0');
		if (b.charAt(0) == '0')
		{
				   for (i = 1;i <= n - 2;i++)
				   {
				  System.out.printf("%c",b.charAt(i));
				   }
		}
		else
		{
			   System.out.printf("%s",b);
		}
	  System.out.printf("\n%d",k);
		}
	System.in.read();
	System.in.read();
	System.in.read();
	}




}

