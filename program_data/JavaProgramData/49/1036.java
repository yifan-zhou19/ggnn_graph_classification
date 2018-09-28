package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> p)
	{
	   int l = p.argValue.length();
	   String te = new String(new char[l]);
	   int i;
	   int j;
	   for (i = 0;i < l;i++)
	   {
		 te = tangible.StringFunctions.changeCharacter(te, l - i - 1, p.argValue.charAt(i));
	   }
	   te = tangible.StringFunctions.changeCharacter(te, l, '\0');
	   /*strcpy(p,te);*/
	   if (strcmp(p.argValue,te) == 0)
	   {
		 return 1;
	   }
	   else
	   {
		  return 0;
	   }

	}

	public static int Main()
	{
		int i;
		int k;
		int j;
		int t;
		int l;
		int m;
		int h;
		int g;
		int n;
	   String p = new String(new char[510]);
	   p = new Scanner(System.in).nextLine();

	   h = p.length();
	  /* printf("%d",judge(p));*/
	   String temp = new String(new char[h]);
	   for (l = 2;l <= h;l++)
	   {
		  for (j = 0;j < h - l + 1;j++)
		  {
				 t = j;
				for (g = 0;g < l;g++)
				{
				   temp = tangible.StringFunctions.changeCharacter(temp, g, p.charAt(t));
				   t++;
				}
				temp = tangible.StringFunctions.changeCharacter(temp, g, '\0');
			tangible.RefObject<String> tempRef_temp = new tangible.RefObject<String>(temp);
				if (judge(tempRef_temp) == 1)
				{
					temp = tempRef_temp.argValue;
					System.out.printf("%s\n",temp);
				}
				else
				{
					temp = tempRef_temp.argValue;
				}
		  }
	   }


	}

}

