package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int t;
	   int i;
	   int j;
	   int k;
	   int l;
	   int m;
	   String a = new String(new char[100000]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < t;i++)
	   {
			for (m = 0;m < 100000;m++)
			{
			 a = tangible.StringFunctions.changeCharacter(a, m, '\0');
			}
		   a = new Scanner(System.in).nextLine();
		   for (m = 100000;m >= 0;m--)
		   {
				 if (a.charAt(m) != '\0')
				 {
				   l = m + 1;
				break;
				 }
		   }
		  for (j = 0;j < l;j++)
		  {
				 for (k = 0;k < l;k++)
				 {
					if (a.charAt(k) == a.charAt(j) && k != j)
					{
					  break;
					}
				 }
			   if (k == l)
			   {
					System.out.printf("%c\n\n",a.charAt(j));
				 break;

			   }
		  }
			if (j == l - 1)
			{
			System.out.print("no\n\n");
			}
	   }
	}
}

