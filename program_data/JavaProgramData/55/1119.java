package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int r;
		int l;
		int x;
		int[] t = new int[40];
		int s;
		int a;
		int b;
		String c = new String(new char[40]);
		String d = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		x = 0;
		for (i = 0;i < l;i++)
		{
		   if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
		   {
			  s = c.charAt(i) - 'A' + 10;
		   }
		   else
		   {
			 if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			 {
			  s = c.charAt(i) - 'a' + 10;
			 }
			 else
			 {
			  s = c.charAt(i) - '0';
			 }
		   }
			x = s + x * a;
		}
		 k = 0;
		 r = x;
		 for (i = 0;i < 40;i++)
		 {
		   t[i] = r % b;
		   r = r / b;
		   k++;
		   if (r == 0)
		   {
		   break;
		   }
		 }
		 for (i = 0;i < k;i++)
		 {
		   if (t[k - 1 - i] >= 0 && t[k - 1 - i] <= 9)
		   {
			 d = tangible.StringFunctions.changeCharacter(d, i, t[k - 1 - i] + '0');
		   }
		   else
		   {
			   if (t[k - 1 - i] >= 10 && t[k - 1 - i] <= 35)
			   {
			 d = tangible.StringFunctions.changeCharacter(d, i, t[k - 1 - i] - 10 + 'A');
			   }
		   }
		 }
		 for (i = 0;i < k;i++)
		 {
		 System.out.printf("%c",d.charAt(i));
		 }
		 System.in.read();
		 System.in.read();
	}

}

