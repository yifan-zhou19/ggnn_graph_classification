package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[30]);
	 String q;
	 a = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int u;
	 q = a;
	  for (i = 0;i < a.length();i++)
	  {
		  if ((*(q.Substring(i)) == '0') || (*(q.Substring(i)) == '1') || (*(q.Substring(i)) == '2') || (*(q.Substring(i)) == '3') || (*(q.Substring(i)) == '4') || (*(q.Substring(i)) == '5') || (*(q.Substring(i)) == '6') || (*(q.Substring(i)) == '7') || (*(q.Substring(i)) == '8') || (*(q.Substring(i)) == '9'))
		  {
	   System.out.print((q.Substring(i)));
		  }
	   if ((*(q.Substring(i)) != '0') && (*(q.Substring(i)) != '1') && (*(q.Substring(i)) != '2') && (*(q.Substring(i)) != '3') && (*(q.Substring(i)) != '4') && (*(q.Substring(i)) != '5') && (*(q.Substring(i)) != '6') && (*(q.Substring(i)) != '7') && (*(q.Substring(i)) != '8') && (*(q.Substring(i)) != '9'))
	   {

		  if (i != 0)
		  {
			  if ((*(q.Substring(i) - 1) == '0') || (*(q.Substring(i) - 1) == '1') || (*(q.Substring(i) - 1) == '2') || (*(q.Substring(i) - 1) == '3') || (*(q.Substring(i) - 1) == '4') || (*(q.Substring(i) - 1) == '5') || (*(q.Substring(i) - 1) == '6') || (*(q.Substring(i) - 1) == '7') || (*(q.Substring(i) - 1) == '8') || (*(q.Substring(i) - 1) == '9'))
			  {
		   System.out.print("\n");
			  }
		  }
	   }
	  }



	return 0;
	}

}
