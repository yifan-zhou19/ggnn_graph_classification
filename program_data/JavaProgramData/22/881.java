package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int f;
	int g;
	int i;
	int[] c = new int[300];
	String d = new String(new char[300]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c[0] = Integer.parseInt(tempVar);
	}


	a = c[0];
	b = -100;
	f = 0;
	g = 0;
	for (i = 1;i < 300;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar2 != null)
		 {
			 d = tangible.StringFunctions.changeCharacter(d, i, tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c[i] = Integer.parseInt(tempVar3);
		 }
	  if (d.charAt(i) == '\n')
	  {
		  break;
	  }
	  else
	  {
			f = f + 1;
	   if (c[i] > a)
	   {
		   b = a;
		   a = c[i];
		   g = g + 1;
	   }
	   else if (c[i] < a && c[i]> b)
	   {
		   b = c[i];
		   g = g + 1;
	   }
	  }
	}
	if (f == 0 || g == 0)
	{
		System.out.print("No");
	}
	else
	{
	 System.out.printf("%d",b);
	}
	return 0;
	}

}

