package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int i;
	   int j = 0;
	   int r;
	   int t = 0;
	   int[] d = new int[10000];
	   String c = new String(new char[100]);
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
	   r = c.length();
	   for (i = 0;i < r;i++)
	   {
		   if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
		   {
			   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 55);
		   }
		   else if (c.charAt(i) <= 122 && c.charAt(i) >= 97)
		   {
			   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 87);
		   }
		   else
		   {
			   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
		   }
		   if ((r - i - 1) != 0)
		   {
			  t = t + c.charAt(i) * (int)Math.pow(a,r - i - 1);
		   }
		   else
		   {
			   t = t + c.charAt(i);
		   }
	   }
	   while (t >= b)
	   {
		   d[j] = t % b;
		   t = t / b;
		   j = j + 1;
	   }
	   d[j] = t;
	   for (i = j;i >= 0;i--)
	   {
		   if (d[i] >= 0 && d[i] <= 9)
		   {
				  System.out.printf("%d",d[i]);
		   }
		   else
		   {
				  System.out.printf("%c",d[i] + 55);
		   }
	   }
	   System.out.print("\n");
	}
}

