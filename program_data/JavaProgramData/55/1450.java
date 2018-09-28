package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int l;
	   int i;
	   int t;
	   int j;
	   int s = 0;
	   String str1 = new String(new char[100]);
	   String str2 = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   str1 = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b = Integer.parseInt(tempVar3);
	   }
	   l = str1.length();
	   for (i = 0;i < l;i++)
	   {
		   if (str1.charAt(i) > 96)
		   {
			   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
		   }
	   }
	   for (i = 0;i < l;i++)
	   {
		   if (str1.charAt(i) > 64)
		   {
			   s = s * a + (str1.charAt(i) - 55);
		   }
		   else
		   {
			   s = s * a + (str1.charAt(i) - 48);
		   }
	   }
	   if (s == 0)
	   {
		   System.out.print("0");
	   }
	   else
	   {
		for (i = 0;s > 0;i++)
		{
			t = s % b;
		s = s / b;
		if (t > 9)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, t + 55);
		}
		else
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, t + 48);
		}
		}
		for (j = 1;j <= i;j++)
		{
			System.out.printf("%c",str2.charAt(i - j));
		}
	   }
	}
}

