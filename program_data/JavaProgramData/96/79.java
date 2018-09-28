package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[2000]);
		  int d;
		  int[] c = new int[2000];
		  int n;
		  int[] b = new int[2000];
		  int f = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	int i = 0;
	while (a.charAt(i) != '\0')
	{
		c[i] = a.charAt(i) - '0';
		i++;
	}
	n = i;
	  d = c[0];
		for (int i = 1;i < n;i++)
		{
				b[i] = (d * 10 + c[i]) / 13;
				d = (d * 10 + c[i]) % 13;
		}
			for (int i = 1;i < n;i++)
			{
					if (b[i] != 0)
					{
								f = i;
								break;
					}
			}
					int j = 0;
	  for (int i = f;i < n;i++,j++)
	  {
	  a = tangible.StringFunctions.changeCharacter(a, j, b[i] + '0');
	  }
	a = a.substring(0, j);
	if (f == 0)
	{
		a = tangible.StringFunctions.changeCharacter(a, 0, '0');
		a = a.substring(0, 1);
	}
	//      for(int i=0;a[i]!='\0';i++) printf("%c",a[i]);
		 System.out.printf("%s",a);
		   System.out.print("\n");
		  System.out.printf("%d",d);
	}


}

