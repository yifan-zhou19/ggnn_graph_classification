package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[26];
	  String c = new String(new char[26]);
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		 String b = new String(new char[100000]);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = tempVar2.charAt(0);
		 }
		 for (j = 0;j <= 25;j++)
		 {
			a[j] = 0;
			c = tangible.StringFunctions.changeCharacter(c, j, '0');
		 }
		 for (j = 0;b.charAt(j) != '\0';j++)
		 {
			for (k = 0;k <= 25;k++)
			{
				if (c.charAt(k) == b.charAt(j))
				{
					a[k]++;
					break;
				}
				if (c.charAt(k) == '0')
				{
					c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(j));
					a[k]++;
					break;
				}
			}
		 }
		 for (j = 0;j <= 25;j++)
		 {
		  if (a[j] == 1)
		  {
		   System.out.printf("%c\n",c.charAt(j));
		   break;
		  }
		 }
		if (j == 26)
		{
		System.out.print("no\n");
		}
	  }
	}


}

