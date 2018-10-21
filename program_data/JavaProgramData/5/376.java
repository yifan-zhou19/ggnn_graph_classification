package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int t;
	int l;
	int p;
	int sum = 0;

	double b;
	double n;

	String z = new String(new char[500]);
	String s = new String(new char[500]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		z = tempVar2.charAt(0);
	}

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s = tempVar3.charAt(0);
	}

	l = z.length();

	p = s.length();

	if (l != p)
	{


	  System.out.print("error");
	}
	else
	{
	   for (i = 0;i < l;i++)
	   {
		  if (z.charAt(i) == 'A' && s.charAt(i) == 'A')
		  {
			  sum++;
		  }

		  else if (z.charAt(i) == 'T' && s.charAt(i) == 'T')
		  {
			  sum++;
		  }

		  else if (z.charAt(i) == 'C' && s.charAt(i) == 'C')
		  {
			  sum++;
		  }

		  else if (z.charAt(i) == 'G' && s.charAt(i) == 'G')
		  {
			  sum++;
		  }

		  else if ((z.charAt(i) != 'A' && z.charAt(i) != 'T' && z.charAt(i) != 'C' && z.charAt(i) != 'G') || (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G'))
		  {
			 t = 0;

			 break;
		  }
	   }

	   if (t == 0)
	   {
		   System.out.print("error");
	   }

	   else
	   {
		   b = (double)sum / l;

		   if (b > n)
		   {
		   System.out.print("yes");
		   }

		   else
		   {
			   System.out.print("no");
		   }
	   }
	}





	return 0;



	}
}

