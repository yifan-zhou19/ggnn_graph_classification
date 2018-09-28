package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[LEN]);
	   int i;
	   int wordlen = 0;
	   int maxlen = 0;
	   int minlen = 30;
	   int iofmax;
	   int iofmin;

	   str = new Scanner(System.in).nextLine();
	   for (i = 0;;i++)
	   {
		  if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
		  {
			  wordlen++;
		  }
		  else
		  {
			if (wordlen > maxlen)
			{
			   maxlen = wordlen;
			   iofmax = i - wordlen;
			}
			if (wordlen < minlen)
			{
			   minlen = wordlen;
			   iofmin = i - wordlen;
			}
			wordlen = 0;
		  }
		  if (str.charAt(i) == '\0')
		  {
			  break;
		  }
	   }

	   for (i = iofmax;i < iofmax + maxlen;i++)
	   {
		   System.out.printf("%c",str.charAt(i));
	   }
	   System.out.print("\n");
	   for (i = iofmin;i < iofmin + minlen;i++)
	   {
		   System.out.printf("%c",str.charAt(i));
	   }
	   System.out.print("\n");

	  return 0;
	}

}
