package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int wa;
		int wb;
		int t = 1;
		int dec = 0;
		int x;
		int y;
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		wa = n.length();
		for (i = 0;i <= wa - 1;i++)
		{
			if (n.charAt(i) != 48)
			{
			t = 0;
			break;
			}
		}
		if (t == 1)
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i <= wa - 1;i++)
			{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
			 x = n.charAt(i) - 48;
		  for (j = 1;j <= wa - i - 1;j++)
		  {
			 x = x * a;
		  }
		  dec = dec + x;
			}
		 if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
		 {
			 x = n.charAt(i) - 55;
		  for (j = 1;j <= wa - i - 1;j++)
		  {
		  x = x * a;
		  }
		  dec = dec + x;
		 }
		 if (n.charAt(i) >= 97 && n.charAt(i) <= 122)
		 {
			 x = n.charAt(i) - 87;
		  for (j = 1;j <= wa - i - 1;j++)
		  {
			 x = x * a;
		  }
		  dec = dec + x;
		 }
			}
		wb = (int)(Math.log(dec) / Math.log(b)) + 1;
		for (i = 0;i <= wb - 1;i++)
		{
			y = dec;
		 for (j = 1;j <= wb - i - 1;j++)
		 {
			y = y / b;
		 }
		 y = y % b;
		 if (y >= 0 && y <= 9)
		 {
			 m = tangible.StringFunctions.changeCharacter(m, i, y + 48);
		 }
		 else
		 {
			 m = tangible.StringFunctions.changeCharacter(m, i, y + 55);
		 }
		}
		 for (i = 0;i <= wb - 1;i++)
		 {
			 System.out.printf("%c",m.charAt(i));
		 }
		 System.out.print("\n");
		}
		return (0);
	}
}

