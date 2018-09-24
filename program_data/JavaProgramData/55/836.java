package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int x;
		int m;
		int l;
		int g;
		int i;
		int j;
		int k;
		int y;
		int z;
		String c = new String(new char[40]);
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
		if (c.charAt(0) == '0')
		{
			System.out.print("0\n");
		}
		else
		{
		 for (i = 0;i < l;i++) //�?0?9?0?7�?0?4?0?3?0?4?0?7
		 {
			 if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			 {
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A'+'a');
			 }
		 }
		 x = 0;
		 int[] d = new int[40];
		 for (i = 0;i < l;i++) //�?0?9?0?3?0?4?0?6?0?7?0?8?0?3?0?5?0?3?0?0?0?4x
		 {
			if (c.charAt(i) >= 'a')
			{
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 10);
			}
			else
			{
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
			}
			d[i] = 1;
			for (j = l - i;j > 1;j--)
			{
				 d[i] = d[i] * a;
			}
			x = x + d[i] * c.charAt(i);
		 }
		 String e = new String(new char[40]);
		 for (k = 0;x != 0;k++) //�?0?9?0?3?0?4?0?6?0?7b?0?5?0?3?0?0?0?4
		 {
			e = tangible.StringFunctions.changeCharacter(e, k, x % b); //?0?5?0?0?0?1?0?6?0?5�?0?8?0?2?0?3?0?8?0?8?0?5?0?7?0?3?0?8?0?5e �?0?7?0?4�
			x = x / b;
		 }
		  e = tangible.StringFunctions.changeCharacter(e, k, '\0');

		  String f = new String(new char[40]); //?0?5?0?0e�?0?9?0?3?0?4?0?6?0?7asc?0?0?0?5 �?0?7?0?4�?0?7?0?3?0?6?0?5f
		  for (y = 0;y < k;y++)
		  {
		   if (e.charAt(y) < 10)
		   {
			   f = tangible.StringFunctions.changeCharacter(f, k - 1 - y, e.charAt(y) + '0');
		   }
		   else
		   {
			   f = tangible.StringFunctions.changeCharacter(f, k - 1 - y, e.charAt(y) - 10 + 'A');
		   }
		  }
		  f = tangible.StringFunctions.changeCharacter(f, k, '\0');
		  System.out.printf("%s",f);
		}
	}

}

