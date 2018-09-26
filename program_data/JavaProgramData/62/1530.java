package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String p = null; //????
	 String string_1 = new String(new char[1000]); //???????????
	 string_1 = new Scanner(System.in).nextLine();
	 p = string_1;
	 int clen;
	 int kong = 0;
	 clen = string_1.length();
	 for (int i = 0;i < clen;i++)
	 {
	  if (*(p.Substring(i)) == ' ')
	  {
	   if (*(p.Substring(i) - 1) == ' ')
	   {
		   kong++; //???++
		for (int j = i;j < clen - kong;j++)
		{
		 *(p.Substring(j)) = *(p.Substring(j) + 1);
		}
		i--;
		*(p.Substring(clen) - kong) = '\0'; //?????????????'\0'
	   }
	  }
	 }
	 System.out.print(p);
	 System.out.print("\n");
	}

}
