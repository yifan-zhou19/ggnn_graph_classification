package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int sum = 0;
		  int m;
		  int k;
		  int l;
		  String c = new String(new char[40]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  m = c.length();
					for (i = 0;i < m;i++)
					{
					if (c.charAt(i) >= 'a')
					{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 'A'-'a');
					}
					if (c.charAt(i) >= 'A')
					{
					sum = (c.charAt(i) + 10 - 'A') + sum * a;
					}
					else if (c.charAt(i) <= '9')
					{
					sum = (c.charAt(i) - '0') + sum * a;
					}
					}


		  char[] d = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		  l = sum;
		  for (i = 0;;i++)
		  {
		  k = l % b;
		  l = l / b;
		  if (k <= 9)
		  {
		  d[i] = k + '0';
		  }
		  else
		  {
		  d[i] = k - 10 + 'A';
		  }

		  m = i + 1;
		  if (l == 0)
		  {
			  break;
		  }
		  }

		  String e = new String(new char[m]);
		  for (i = 0;i <= m - 1;i++)
		  {
		  e = tangible.StringFunctions.changeCharacter(e, m - 1 - i, d[i]);
		  }
		  e = tangible.StringFunctions.changeCharacter(e, m, '\0');
		  System.out.println(e);


	}



}

