package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int len;
	 String x = new String(new char[100]);
	 char a;
	 char b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = tempVar.charAt(0);
	 }
	 len = x.length();
	 a = x.charAt(0);
	 b = x.charAt(len - 1);
	 for (i = 0;i < len / 2;i++)
	 {
		   for (j = 0;j < len;j++)
		   {
			if (x.charAt(j) == b)
			{
					for (k = j - 1;x.charAt(k) != a;k--)
					{
						;
					}
				 System.out.printf("%d %d\n",k,j);
				 x = tangible.StringFunctions.changeCharacter(x, j, '.');
				 x = tangible.StringFunctions.changeCharacter(x, k, '.');
				 break;
			}
		   }
	 }

	}
}

