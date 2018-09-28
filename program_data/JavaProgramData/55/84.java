package <missing>;

public class GlobalMembers
{
	public static int zhuan(int a, String n)
	{
		int d = 0;
		int c;
		int i;
		int j;
		for (i = 0; !n[i].equals('\0');i++)
		{
			 if (n[i].compareTo(48) >= 0 && n[i].compareTo(57) <= 0)
			 {
				c = n[i] - 48;
			 }
			 else if (n[i].compareTo(90) <= 0 && n[i].compareTo(65) >= 0)
			 {
				c = n[i] - 55;
			 }
			 else if (n[i].compareTo(97) >= 0 && n[i].compareTo(122) <= 0)
			 {
				   c = n[i] - 87;
			 }
			 for (j = i + 1; !n[j].equals('\0');j++)
			 {
				 c = c * a;
			 }
			 d = d + c;
		}
		return d;
	}
	public static void huan(int b,int c)
	{
	   int d;
	   int i;
	   int j;
	   String n = new String(new char[100]);
	   if (c == 0)
	   {
		  System.out.print("0\n");
	   }
	   for (i = 0;c != 0;i++)
	   {
			 d = c % b;
			 c = c / b;
			 if (d <= 9 && d >= 0)
			 {
				n = tangible.StringFunctions.changeCharacter(n, i, d + 48);
			 }
			 else if (d >= 10 && d <= 35)
			 {
				n = tangible.StringFunctions.changeCharacter(n, i, d + 55);
			 }
	   }
		 for (j = i - 1;j > 0;j--)
		 {
		   System.out.printf("%c",n.charAt(j));
		 }
		 System.out.printf("%c\n",n.charAt(0));
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = zhuan(a, n);
		huan(b, c);
		return 0;
	}
}

