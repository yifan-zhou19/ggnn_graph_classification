package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[100]);
	  String s = new String(new char[100]);
	  int[] a = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  int i;
	  for (i = 0;i < 100;i++)
	  {
	   if (c.charAt(i) != '\0')
	   {
	   a[i] = c.charAt(i) - '0';
	   }
	   else if (c.charAt(i) == '\0')
	   {
	   break;
	   }
	  }
	  int d = 0;
	  int j;
	  int k = 0;
	  for (j = 0;j < i;j++)
	  {
		d = a[j] + d * 10;
		if (d >= 13)
		{
		 s = tangible.StringFunctions.changeCharacter(s, k, d / 13 + '0');
		 k++;
		 d = d % 13;
		}
		else if (k != 0)
		{
			 s = tangible.StringFunctions.changeCharacter(s, k, '0');
			 k++;
		}
	  }
	   s = tangible.StringFunctions.changeCharacter(s, k, '\0');
	   if (i == 1)
	   {
		   s = tangible.StringFunctions.changeCharacter(s, 0, '0');
		   s = tangible.StringFunctions.changeCharacter(s, 1, '\0');
		   d = a[0];
	   }
	  else if ((i == 2) && (a[0] * 10 + a[1] < 13))
	  {
		   s = tangible.StringFunctions.changeCharacter(s, 0, '0');
		   s = tangible.StringFunctions.changeCharacter(s, 1, '\0');
		   d = a[0] * 10 + a[1];

	  }
	   System.out.printf("%s\n",s);
	   System.out.printf("%d\n",d);
	}

}

