package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int x;
		  int j;
		  int l;
		  int y;
		  String c = new String(new char[1000]);
		  String f = new String(new char[1000]);
		  int[] e = new int[1000];
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
		  l = c.length();
		  x = 0;
		  int[] d = new int[l];
			  for (i = 0;i < l;i++)
			  {
				  if (c.charAt(i) <= 'Z' && c.charAt(i) >= 'A')
				  {
				  d[i] = c.charAt(i) - 'A' + 10;
				  }
				 else if (c.charAt(i) <= 'z' && c.charAt(i) >= 'a')
				 {
				  d[i] = c.charAt(i) - 'a' + 10;
				 }
				  else
				  {
				  d[i] = c.charAt(i) - '0';
				  }
				  x = d[i] + x * a;
			  }
				  if (x == 0)
				  {
		System.out.printf("%d",0);
				  }
			  for (j = 0;x != 0;j++)
			  {
				  e[j] = x % b;
				  x = x / b;
			  }
	  e[j] = 0;
			  for (y = 0;y < j;y++)
			  {
				  if (e[y] <= 9)
				  {
				  f = tangible.StringFunctions.changeCharacter(f, j - 1 - y, '0' + e[y]);
				  }
				  else
				  {
				  f = tangible.StringFunctions.changeCharacter(f, j - 1 - y, e[y] - 10 + 'A');
				  }
			  f = tangible.StringFunctions.changeCharacter(f, j, '\0');
			  }

		  System.out.printf("%s",f);
		  System.out.print("\n");

		  System.in.read();
		  System.in.read();
	}



}

