package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int n;
		String str1 = new String(new char[40]);
		String str2 = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = str1.length();
		n = 0;
		for (i = c - 1,j = 0;i >= 0,j <= c - 1;i--,j++)

		{
		 if (str1.charAt(j) >= '0' && str1.charAt(j) <= '9')
		 {
		 d = str1.charAt(j) - 48;
		 }
		 else
		 {
			  if (str1.charAt(j) >= 'A' && str1.charAt(j) <= 'Z')
			  {
			   d = str1.charAt(j) - 55;
			  }
			   else
			   {
			   d = str1.charAt(j) - 87;
			   }
		 }
		 e = 1;
		 if (i > 0)
		 {
		for (k = i;k > 0;k--)
		{
		 e = e * a;
		}
		 }
		 n = n + d * e;
		}


		for (k = 0;k <= 40;k++)
		{
			if (n < b)
			{
			f = n;
		 if (f >= 0 && f <= 9)
		 {
		 str2 = tangible.StringFunctions.changeCharacter(str2, k, f + 48);
		 }
		 else
		 {
		 str2 = tangible.StringFunctions.changeCharacter(str2, k, f + 55);
		 }
		 break;
			}
		 else
		 {
			 f = n % b;
		  if (f >= 0 && f <= 9)
		  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, k, f + 48);
		  }
		  else
		  {
		  str2 = tangible.StringFunctions.changeCharacter(str2, k, f + 55);
		  }
		 }
		  n = (n - f) / b;
		}
	g = str2.length();
	for (h = g - 1;h >= 0;h--)
	{
	System.out.printf("%c",str2.charAt(h));
	}

	}

}

