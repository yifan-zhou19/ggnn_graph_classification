package <missing>;

public class GlobalMembers
{
	public static void kuohao(String str, int x)
	{
	  if (x < lenth)
	  {
		  if (!str[x].equals(c))
		  {
			 int i = x - 1;
			 int zuo = 0;
			 int you = 0;
			 while (true)
			 {
			   if (str[i].equals(c))
			   {
					zuo++;
			   }
			   else
			   {
					 you++;
			   }
			   if (zuo == you + 1)
			   {
				  break;
			   }
			   i--;
			 }
			 System.out.print(i);
			 System.out.print(" ");
			 System.out.print(x);
			 System.out.print("\n");
			 kuohao(str, x + 1);
		  }
		   else
		   {
			  kuohao(str, x + 1);
		   }
	  }
	}
	public static int lenth;
	public static char c;
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenth = a.length();
		c = a.charAt(0);
		kuohao(a, 1);
	return 0;
	}
}

