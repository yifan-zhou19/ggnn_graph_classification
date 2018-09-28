package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String string = new String(new char[30]);
	 String = new Scanner(System.in).nextLine();
	 String p = String;
	 int clen;
	 int nolen = 0;
	 clen = String.length();
	 for (int i = 0;i < clen;i++)
	 {
		 if (*(p.Substring(i)) < '0' || *(p.Substring(i))>'9')
		 {
			 int ilen = 0;
		  if (*(p.Substring(i) - 1) < '0' || *(p.Substring(i) - 1)>'9')
		  {
			  nolen++;
			  ilen++;
			  int jj = 1;
		  while (true)
		  {
		   if (*(p.Substring(jj) + i) < '0' || *(p.Substring(jj) + i)>'9')
		   {
			   nolen++;
			   ilen++;
			   jj++;
		   }
		   else
		   {
			   break;
		   }
		  }
		   for (int j = i;j < clen - nolen;j++)
		   {
			*(p.Substring(j)) = *(p.Substring(j) + ilen);
		   }
		  }
		  else
		  {
			  *(p.Substring(i)) = '\n';
		  }
		 }
	 }
	 String[clen - nolen] = '\0';
	 for (int j = 0;j < clen;j++)
	 {
	  if ((String[j] < '0' || string.charAt(j)>'9') && (String[j] != '\n'))
	  {
	   String[j] = '\0';
	   break;
	  }
	 }
	 System.out.print(String);
	 System.out.print("\n");
	 return 0;
	}
}
